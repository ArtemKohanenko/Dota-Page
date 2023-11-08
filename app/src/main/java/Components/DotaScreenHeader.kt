package Components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.dotapage.R
import com.example.dotapage.ui.theme.AppTheme

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier, contentAlignment = Alignment.BottomStart) {
        HeaderBackground(
            painter = painterResource(R.drawable.bg_header),
            modifier = modifier.zIndex(0f)
        )
        Row (modifier = Modifier.zIndex(2f)) {
            Spacer(modifier = Modifier.width(24.dp))
            GameTitle()
        }
        Box(
            modifier = modifier
                .background(
                    AppTheme.BgColors.primary,
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
