package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
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
            val painter =
            if (index.toFloat() + 1.5 < rating) {
                painterResource(R.drawable.star_filled)
            }
            else if (index.toFloat() + 0.5 < rating && rating < index.toFloat() + 1) {
                painterResource(R.drawable.star_empty)
            }
            else {
                painterResource(R.drawable.star_half)
            }

            Image(
                modifier = Modifier
                    .size(12.dp),
                painter = painter,
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
fun PreviewRatingStars() {
    RatingStars(3.4f)
}