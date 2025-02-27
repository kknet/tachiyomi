package eu.kanade.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BadgeGroup(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(4.dp),
    content: @Composable RowScope.() -> Unit,
) {
    Row(modifier = modifier.clip(shape)) {
        content()
    }
}

@Composable
fun Badge(
    text: String,
    color: Color = MaterialTheme.colorScheme.secondary,
    textColor: Color = MaterialTheme.colorScheme.onSecondary,
    shape: Shape = RectangleShape,
) {
    Box(
        modifier = Modifier
            .clip(shape)
            .background(color),
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
            style = LocalTextStyle.current.copy(
                color = textColor,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}
