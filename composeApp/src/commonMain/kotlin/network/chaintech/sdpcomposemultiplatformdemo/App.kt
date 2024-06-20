package network.chaintech.sdpcomposemultiplatformdemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import network.chaintech.sdpcomposemultiplatform.sdp
import network.chaintech.sdpcomposemultiplatform.ssp
import network.chaintech.sdpcomposemultiplatformdemo.theme.AppTheme
import org.jetbrains.compose.resources.painterResource
import sdp_compose_multiplatform_demo.composeapp.generated.resources.Res
import sdp_compose_multiplatform_demo.composeapp.generated.resources.ic_user

@Composable
internal fun App() = AppTheme {
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(0.82f),
            shape = RoundedCornerShape(16.sdp),
            colors = CardDefaults.cardColors(Color(0xFFFBF3E8)),
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF585DDB))
                        .padding(vertical = 16.sdp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        modifier = Modifier
                            .size(80.sdp),
                        painter = painterResource(Res.drawable.ic_user),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )

                    Text(
                        text = "Emily Dounger",
                        fontSize = 16.ssp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 12.sdp)
                    )
                }

                Text(
                    text = "Hi there \uD83D\uDC4B , We are Boards to share initital Goals and ideas.",
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    lineHeight = 18.ssp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 30.sdp).padding(horizontal = 20.sdp)
                )

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF007AFF)),
                    modifier = Modifier.padding(top = 24.sdp, bottom = 20.sdp)
                        .padding(horizontal = 20.sdp).fillMaxWidth().height(40.sdp)
                ) {
                    Text(text = "Say Hello", fontSize = 16.ssp)
                }
            }
        }
    }
}



