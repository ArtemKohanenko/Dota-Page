package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.R
import com.example.dotapage.ui.theme.AppTheme
import com.example.dotapage.ui.theme.fontF

data class Review(val author: String, val date: String, val body: String, val picture: Int)

val review = Review("Auguste Conte",
    "February 14, 2019",
    "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
    R.drawable.profile_1)

@Composable
fun ReviewAndRating() {
    val data: List<Review> = listOf(
        Review(
            stringResource(R.string.review1_name),
            stringResource(R.string.review1_date),
            stringResource(R.string.review1_text),
            R.drawable.profile_1),
        Review(
            stringResource(R.string.review2_name),
            stringResource(R.string.review2_date),
            stringResource(R.string.review2_text),
            R.drawable.profile_2)
    )

    Column {
        Text(
            stringResource(R.string.review_title),
            fontSize = 16.sp,
            color = AppTheme.TextColors.primary,
            fontFamily = fontF,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(28.dp))
        Rating()
        Spacer(modifier = Modifier.height(28.dp))
        ReviewList(data)
    }
}

@Composable
fun ReviewList(reviews: List<Review>) {
    Column {
        for (review in reviews) {
            ReviewCard(review)
        }
    }
}

@Composable
fun ReviewCard(review: Review) {

    Column (verticalArrangement = Arrangement.Center) {
        Row {
            Image(
                painter = painterResource(review.picture),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 36.dp, height = 36.dp)
                    .clip(shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(review.author, color= AppTheme.TextColors.title, fontFamily = fontF)
                Spacer(modifier = Modifier.height(7.dp))
                Text(review.date, color = AppTheme.TextColors.secondary, fontFamily = fontF)
            }
        }
        Spacer(modifier = Modifier.height(17.dp))
        Text(review.body, color = AppTheme.TextColors.primary, fontFamily = fontF)

        Spacer(modifier = Modifier.height(24.dp))
        Box(
            modifier = Modifier
                .height(1.dp)
                .width(300.dp)
                .background(color = AppTheme.BgColors.tertiary)
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun Rating() {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("4.9",
            color = AppTheme.TextColors.title,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = fontF
            )
        Spacer(modifier = Modifier.width(17.dp))
        Column {
            RatingStars(4.9f, modifier = Modifier
                .height(12.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Text("70" + stringResource(R.string.units_million) + " " + stringResource(R.string.reviews_text),
                color = AppTheme.TextColors.secondary,
                fontSize=12.sp,
                fontFamily = fontF
                )
        }
    }
}

@Preview
@Composable
fun PreviewReviewList() {
    ReviewAndRating()
}