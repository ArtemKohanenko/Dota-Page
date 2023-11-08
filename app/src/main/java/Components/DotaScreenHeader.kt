package Components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.dotapage.R

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier, contentAlignment = Alignment.BottomStart) {
        HeaderBackground(
            painter = painterResource(R.drawable.bg_header),
            modifier = modifier.zIndex(0f).background(Color.Green)
        )
        Row (modifier = Modifier.zIndex(2f)) {
            Spacer(modifier = Modifier.width(24.dp))
            GameTitle()
        }
        Box(
            modifier = modifier
                .background(
                    Color(android.graphics.Color.parseColor("#050B18")),
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .height(55.dp)
                .fillMaxWidth()
                .zIndex(1f)
        ) {}
    }
}

@Composable
private fun HeaderBackground (
    painter: Painter,
    modifier: Modifier
) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(340.dp)
            .aspectRatio(1f),
        painter = painter,
        contentDescription = "Header picture"
    )
}

@Preview
@Composable
fun PreviewDotaScreenHeader() {
    DotaScreenHeader()
}
