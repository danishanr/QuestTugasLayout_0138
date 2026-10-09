package com.example.questtugaslayout_0138.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_0138.R

@Composable
fun TugasKetiga(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    )
    Column(
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height((25.dp)))

        CardCustom(
            nama = stringResource(R.string.nama_1),
            nim = null,
            alamat = stringResource(R.string.alamat_1),
            warna = colorResource(R.color.card_1_bg),
            warnaAlamat = colorResource(R.color.text_kuning),
            fontNama = FontFamily.Cursive,
            bobotNama = FontWeight.Normal
        )

        CardCustom(
            nama = stringResource(R.string.nama_2),
            nim = stringResource(R.string.nim_2),
            alamat = stringResource(R.string.alamat_2),
            warna = colorResource(R.color.card_2_bg),
            warnaAlamat = colorResource(R.color.text_kuning)
        )

        CardCustom(
            nama = stringResource(R.string.nama_3),
            nim = stringResource(R.string.nim_3),
            alamat = stringResource(R.string.alamat_3),
            warna = colorResource(R.color.card_3_bg)
        )

        CardCustom(
            nama = stringResource(R.string.nama_4),
            nim = stringResource(R.string.nim_4),
            alamat = stringResource(R.string.alamat_4),
            warna = colorResource(R.color.card_4_bg)
        )
    }

    Text(
        stringResource(R.string.copy),
        fontSize = 12.sp,
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 30,dp)
    )
}

@Composable
fun CardCustom(
    nama: String,
    nim: String?,
    alamat: String,
    warna: Color,
    modifier: Modifier = Modifier,
    warnaAlamat: Color = colorResource(R.color.white),
    fontNama: FontFamily = FontFamily.Default,
    bobotNama: FontWeight = FontWeight.Bold
) {

}
