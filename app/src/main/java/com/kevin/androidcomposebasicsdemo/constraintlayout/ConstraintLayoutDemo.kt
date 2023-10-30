package com.kevin.androidcomposebasicsdemo.constraintlayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

class ConstraintLayoutDemo {

    @Preview
    @Composable
    fun ConstraintDemo() {

        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
        ) {
            val (r1, r2, r3, r4, r5, r6, r7, r8) = createRefs()

            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r1) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r2) {
                    top.linkTo(r1.bottom)
                    start.linkTo(r1.end)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r3) {
                    top.linkTo(r2.bottom)
                    start.linkTo(r2.end)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r4) {
                    top.linkTo(r3.bottom)
                    start.linkTo(r3.end)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r5) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r6) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r7) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                })


        }
    }


    @Preview
    @Composable
    fun GuideLines() {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
        ) {

            val (r1, r2, r3) = createRefs()

            val guideLine = createGuidelineFromStart(0.5f)
            val guideLine2 = createGuidelineFromTop(0.5f)

            val guideLine3 = createGuidelineFromBottom(0.25f)
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r1) {
                    top.linkTo(parent.top)
                    start.linkTo(guideLine)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r2) {
                    top.linkTo(guideLine2)
                    start.linkTo(guideLine)
                })
            Box(modifier = Modifier
                .background(Color.Black)
                .size(50.dp)
                .constrainAs(r3) {
                    top.linkTo(guideLine3)
                    start.linkTo(parent.start)
                })
        }
    }

}