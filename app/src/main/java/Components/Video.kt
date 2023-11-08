package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dotapage.R

@Composable
fun Video(video: Int) {
    Box (contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(video),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 16.dp)
                .size(width = 240.dp, height = 128.dp)
                .clip(shape = RoundedCornerShape(12.dp))
        )
        Box (contentAlignment = Alignment.Center, modifier = Modifier
            .size(48.dp)
            .clip(shape = CircleShape)
            .background(Color(255,255,255,80), shape = CircleShape)
            ) {
            Image(
                painter = painterResource(R.drawable.arrow),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
            )
        }
    }
}