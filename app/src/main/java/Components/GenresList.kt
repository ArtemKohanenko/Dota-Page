package Components

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.R

val genresList = listOf(
    "MOBA",
    "MULTIPLAYER",
    "STRATEGY"
)

@Preview
@Composable
fun GenresList(modifier: Modifier = Modifier) {
    LazyRow (modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        items(genresList) { genre ->
            GenreTag(genre)
        }
    }
}

@Composable
fun GenreTag(genre: String) {
    Box (modifier = Modifier
        .background(
            Color(68, 169, 244, 61),
            shape = RoundedCornerShape(100.dp))
    ){
        Text(genre,
            color = Color(parseColor("#41A0E7")),
            fontSize = 10.sp,
            modifier = Modifier
                .padding(
                    start=10.dp,
                    end=10.dp,
                    bottom=5.dp,
                    top=5.dp
                ))
    }
}