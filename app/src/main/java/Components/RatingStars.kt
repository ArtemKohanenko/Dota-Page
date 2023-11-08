package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotapage.R

@Composable
fun RatingStars(rating: Float, modifier: Modifier = Modifier) {
    Row (modifier = modifier) {
        repeat(5) { index ->
            val tempIndex = index + 1
            val painter =
            if (index + 1 < rating) {
                painterResource(R.drawable.star_filled)
            }
            else if (index.toFloat() + 0.5 < rating) {
                painterResource(R.drawable.star_half)
            }
            else {
                painterResource(R.drawable.star_empty)
            }

            Image(
                painter = painter,
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
fun PreviewRatingStars() {
    RatingStars(3.6f, modifier = Modifier.height(12.dp))
}