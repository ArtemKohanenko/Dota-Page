package Components

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.R
import com.example.dotapage.fontF

data class Review(val author: String, val date: String, val body: String, val picture: Int)

val data: List<Review> = listOf(
    Review("Auguste Conte",
        "February 14, 2019",
        "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        R.drawable.profile_1),
    Review("Jang Marcelino",
        "February 14, 2019",
        "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        R.drawable.profile_2)
)

val review = Review("Auguste Conte",
    "February 14, 2019",
    "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
    R.drawable.profile_1)

@Composable
fun ReviewAndRating() {
    Column {
        Text(
            "Review & Ratings",
            fontSize = 16.sp,
            color = Color.White,
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
    LazyColumn {
        items(reviews) {review ->
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
                Text(review.author, color= Color.White, fontFamily = fontF)
                Spacer(modifier = Modifier.height(7.dp))
                Text(review.date, color = Color(parseColor("#A8ADB7")), fontFamily = fontF)
            }
        }
        Spacer(modifier = Modifier.height(17.dp))
        Text(review.body, color = Color(parseColor("#A8ADB7")), fontFamily = fontF)

        Spacer(modifier = Modifier.height(24.dp))
        Box(
            modifier = Modifier
                .height(1.dp)
                .width(300.dp)
                .background(color = Color(parseColor("#1A1F29")))
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
            color = Color.White,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = fontF
            )
        Spacer(modifier = Modifier.width(17.dp))
        Column {
            Image(
                modifier = Modifier
                    .size(height = 12.dp, width = 76.dp),
                painter = painterResource(R.drawable.rate),
                contentDescription = "AppRate"
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("70M Reviews",
                color = Color(parseColor("#A8ADB7")),
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