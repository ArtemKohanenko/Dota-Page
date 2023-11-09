package Components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.R
import com.example.dotapage.ui.theme.AppTheme
import com.example.dotapage.ui.theme.fontF


@Composable
fun DotaScreenContent(modifier: Modifier = Modifier) {

    Surface(color = AppTheme.BgColors.primary) {
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
                text = stringResource(R.string.app_description),
                color = AppTheme.TextColors.primary,
                fontFamily = fontF
            )
            Spacer(modifier = Modifier.height(24.dp))
            Box(modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp
                )) {
                ScreensChipsRow()
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
                    .size(width = 327.dp, height = 64.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = AppTheme.ButtonColors.primary)
            ) {
                Text(stringResource(R.string.button_install),fontSize=20.sp)
            }
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

@Preview
@Composable
fun PreviewDotaScreenContent() {
    DotaScreenContent()
}