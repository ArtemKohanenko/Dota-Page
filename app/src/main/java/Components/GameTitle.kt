package Components

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotapage.R

@Composable
fun GameTitle (modifier: Modifier = Modifier) {
    Row (modifier = modifier) {
        DotaIcon()
    }
}

@Composable
private fun DotaIcon(modifier: Modifier = Modifier) {

    Box(modifier = Modifier
        .background(Color.Black, shape = RoundedCornerShape(12.dp))
        .size(width = 84.dp, height = 84.dp)
        .border(2.dp,
            Color(parseColor("#1F2430")),
            shape = RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center
        ) {
        Image(
            modifier = Modifier
                .size(height = 54.dp, width = 54.dp),
            painter = painterResource(R.drawable.dota_icon),
            contentDescription = "AppIcon"
        )
    }
}

@Preview
@Composable
fun PreviewDotaIcon() {
    DotaIcon()
}

@Preview
@Composable
fun PreviewGameTitle() {
    GameTitle()
}
