package Components

import android.graphics.Color.parseColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.R
import com.example.dotapage.fontF

val screensList = listOf(
    R.drawable.screen_1,
    R.drawable.screen_2
)

@Composable
fun DotaScreenContent(modifier: Modifier = Modifier) {

    Surface(modifier = modifier
        .height(1000.dp),
        color = Color(parseColor("#050B18"))
    ) {
        Column {
            Spacer(modifier = Modifier.height(16.dp))
            GenresList(modifier = Modifier
                .padding(start=24.dp))
            Spacer(modifier = Modifier.height(24.dp))
            Text(modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    ),
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                color = Color.White,
                fontFamily = fontF
            )
            Spacer(modifier = Modifier.height(24.dp))
            Box(modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp
                )) {
                Screens()
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp
                    )) {
                ReviewAndRating()
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(width=327.dp, height=64.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(parseColor("#F4D144")))
            ) {
                Text("Install", fontSize=20.sp)
            }
        }
    }
}

@Composable
fun Screens() {
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

@Preview
@Composable
fun PreviewDotaScreenContent() {
    DotaScreenContent()
}