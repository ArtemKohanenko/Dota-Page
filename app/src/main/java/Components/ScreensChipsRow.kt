package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dotapage.R

val screensList = listOf(
    R.drawable.screen_1,
    R.drawable.screen_2
)

@Composable
fun ScreensChipsRow () {
    LazyRow {
        item {
            Video(R.drawable.screen_1)
        }
        items(screensList) { screen ->
            Image(
                painter = painterResource(screen),
                contentDescription = null,
                modifier = Modifier
                    .padding(end=16.dp)
                    .size(width=240.dp, height=128.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
            )
        }
    }
}