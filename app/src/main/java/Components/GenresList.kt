package Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.ui.theme.AppTheme

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
            AppTheme.BgColors.genreTag,
            shape = RoundedCornerShape(100.dp))
    ){
        Text(genre,
            color = AppTheme.TextColors.genreTag,
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