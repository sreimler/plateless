package com.sreimler.plateless.presentation.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object AppIcons {

    val Burger: ImageVector
        get() {
            if (_LauncherIcon != null) {
                return _LauncherIcon!!
            }
            _LauncherIcon = ImageVector.Builder(
                name = "IconName",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f
            ).apply {
                path(
                    fill = SolidColor(Color.Black),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(22f, 10f)
                    curveToRelative(0.32f, -3.28f, -4.28f, -6f, -9.99f, -6f)
                    curveTo(6.3f, 4f, 1.7f, 6.72f, 2.02f, 10f)
                    horizontalLineTo(22f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Black),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5.35f, 13.5f)
                    curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                    curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                    reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f)
                    curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                    curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                    curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                    curveToRelative(1.11f, 0f, 1.73f, -0.37f, 2.18f, -0.64f)
                    curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                    curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                    curveToRelative(0.45f, 0.27f, 1.07f, 0.63f, 2.17f, 0.64f)
                    verticalLineToRelative(-1.98f)
                    curveToRelative(0f, 0f, -0.79f, -0.16f, -1.16f, -0.38f)
                    curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                    curveToRelative(-1.11f, 0f, -1.73f, 0.37f, -2.18f, 0.64f)
                    curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f)
                    reflectiveCurveToRelative(-0.78f, -0.14f, -1.15f, -0.36f)
                    curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                    reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f)
                    curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                    curveToRelative(-0.55f, 0f, -0.78f, -0.14f, -1.15f, -0.36f)
                    curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                    curveToRelative(-1.11f, 0f, -1.73f, 0.37f, -2.18f, 0.64f)
                    curveTo(2.78f, 12.37f, 2.56f, 12.5f, 2f, 12.5f)
                    verticalLineToRelative(2f)
                    curveToRelative(1.11f, 0f, 1.73f, -0.37f, 2.21f, -0.64f)
                    curveTo(4.58f, 13.63f, 4.8f, 13.5f, 5.35f, 13.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Black),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(2f, 16f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(2f)
                    close()
                }
            }.build()

            return _LauncherIcon!!
        }

    private var _LauncherIcon: ImageVector? = null

    val ForkSpoon: ImageVector
        get() {
            if (_ForkSpoon != null) {
                return _ForkSpoon!!
            }
            _ForkSpoon = ImageVector.Builder(
                name = "ForkSpoon",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(240f, 880f)
                    lineTo(240f, 514f)
                    quadTo(186f, 500f, 153f, 457f)
                    quadTo(120f, 414f, 120f, 360f)
                    lineTo(120f, 80f)
                    lineTo(200f, 80f)
                    lineTo(200f, 320f)
                    lineTo(240f, 320f)
                    lineTo(240f, 80f)
                    lineTo(320f, 80f)
                    lineTo(320f, 320f)
                    lineTo(360f, 320f)
                    lineTo(360f, 80f)
                    lineTo(440f, 80f)
                    lineTo(440f, 360f)
                    quadTo(440f, 414f, 407f, 457f)
                    quadTo(374f, 500f, 320f, 514f)
                    lineTo(320f, 880f)
                    lineTo(240f, 880f)
                    close()
                    moveTo(640f, 880f)
                    lineTo(640f, 499f)
                    quadTo(586f, 481f, 553f, 423.5f)
                    quadTo(520f, 366f, 520f, 293f)
                    quadTo(520f, 204f, 567f, 142f)
                    quadTo(614f, 80f, 680f, 80f)
                    quadTo(746f, 80f, 793f, 142.5f)
                    quadTo(840f, 205f, 840f, 294f)
                    quadTo(840f, 367f, 807f, 424f)
                    quadTo(774f, 481f, 720f, 499f)
                    lineTo(720f, 880f)
                    lineTo(640f, 880f)
                    close()
                }
            }.build()

            return _ForkSpoon!!
        }

    private var _ForkSpoon: ImageVector? = null

    val Scale: ImageVector
        get() {
            if (_Scale != null) return _Scale!!

            _Scale = ImageVector.Builder(
                name = "Scale",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(80f, 880f)
                    quadToRelative(0f, -111f, 29.5f, -189.5f)
                    reflectiveQuadTo(185f, 560f)
                    reflectiveQuadToRelative(103f, -80.5f)
                    reflectiveQuadTo(400f, 440f)
                    verticalLineToRelative(-120f)
                    quadToRelative(-137f, -17f, -228.5f, -84.5f)
                    reflectiveQuadTo(80f, 80f)
                    horizontalLineToRelative(800f)
                    quadToRelative(0f, 88f, -91.5f, 155.5f)
                    reflectiveQuadTo(560f, 320f)
                    verticalLineToRelative(120f)
                    quadToRelative(55f, 11f, 112f, 39.5f)
                    reflectiveQuadTo(775f, 560f)
                    reflectiveQuadToRelative(75.5f, 130.5f)
                    reflectiveQuadTo(880f, 880f)
                    horizontalLineTo(640f)
                    verticalLineToRelative(-80f)
                    horizontalLineToRelative(155f)
                    quadToRelative(-18f, -152f, -113.5f, -220f)
                    reflectiveQuadTo(480f, 512f)
                    reflectiveQuadToRelative(-201.5f, 68f)
                    reflectiveQuadTo(165f, 800f)
                    horizontalLineToRelative(155f)
                    verticalLineToRelative(80f)
                    close()
                    moveToRelative(400f, -635f)
                    quadToRelative(91f, 0f, 162f, -24.5f)
                    reflectiveQuadTo(755f, 160f)
                    horizontalLineTo(205f)
                    quadToRelative(42f, 36f, 113f, 60.5f)
                    reflectiveQuadTo(480f, 245f)
                    moveToRelative(0f, 635f)
                    quadToRelative(-33f, 0f, -56.5f, -23.5f)
                    reflectiveQuadTo(400f, 800f)
                    quadToRelative(0f, -17f, 6.5f, -31f)
                    reflectiveQuadToRelative(17.5f, -25f)
                    quadToRelative(24f, -24f, 81f, -50.5f)
                    reflectiveQuadTo(640f, 640f)
                    quadToRelative(-28f, 78f, -54f, 135f)
                    reflectiveQuadToRelative(-50f, 81f)
                    quadToRelative(-11f, 11f, -25f, 17.5f)
                    reflectiveQuadTo(480f, 880f)
                    moveToRelative(0f, -635f)
                }
            }.build()

            return _Scale!!
        }

    private var _Scale: ImageVector? = null

    val People: ImageVector
        get() {
            if (_People != null) return _People!!

            _People = ImageVector.Builder(
                name = "People",
                defaultWidth = 16.dp,
                defaultHeight = 16.dp,
                viewportWidth = 16f,
                viewportHeight = 16f
            ).apply {
                path(
                    fill = SolidColor(Color.Black)
                ) {
                    moveTo(15f, 14f)
                    reflectiveCurveToRelative(1f, 0f, 1f, -1f)
                    reflectiveCurveToRelative(-1f, -4f, -5f, -4f)
                    reflectiveCurveToRelative(-5f, 3f, -5f, 4f)
                    reflectiveCurveToRelative(1f, 1f, 1f, 1f)
                    close()
                    moveToRelative(-7.978f, -1f)
                    lineTo(7f, 12.996f)
                    curveToRelative(0.001f, -0.264f, 0.167f, -1.03f, 0.76f, -1.72f)
                    curveTo(8.312f, 10.629f, 9.282f, 10f, 11f, 10f)
                    curveToRelative(1.717f, 0f, 2.687f, 0.63f, 3.24f, 1.276f)
                    curveToRelative(0.593f, 0.69f, 0.758f, 1.457f, 0.76f, 1.72f)
                    lineToRelative(-0.008f, 0.002f)
                    lineToRelative(-0.014f, 0.002f)
                    close()
                    moveTo(11f, 7f)
                    arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                    arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                    moveToRelative(3f, -2f)
                    arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                    arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                    moveTo(6.936f, 9.28f)
                    arcToRelative(6f, 6f, 0f, false, false, -1.23f, -0.247f)
                    arcTo(7f, 7f, 0f, false, false, 5f, 9f)
                    curveToRelative(-4f, 0f, -5f, 3f, -5f, 4f)
                    quadToRelative(0f, 1f, 1f, 1f)
                    horizontalLineToRelative(4.216f)
                    arcTo(2.24f, 2.24f, 0f, false, true, 5f, 13f)
                    curveToRelative(0f, -1.01f, 0.377f, -2.042f, 1.09f, -2.904f)
                    curveToRelative(0.243f, -0.294f, 0.526f, -0.569f, 0.846f, -0.816f)
                    moveTo(4.92f, 10f)
                    arcTo(5.5f, 5.5f, 0f, false, false, 4f, 13f)
                    horizontalLineTo(1f)
                    curveToRelative(0f, -0.26f, 0.164f, -1.03f, 0.76f, -1.724f)
                    curveToRelative(0.545f, -0.636f, 1.492f, -1.256f, 3.16f, -1.275f)
                    close()
                    moveTo(1.5f, 5.5f)
                    arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                    arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                    moveToRelative(3f, -2f)
                    arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                    arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                }
            }.build()

            return _People!!
        }

    private var _People: ImageVector? = null

    val Settings: ImageVector
        get() {
            if (_Settings != null) {
                return _Settings!!
            }
            _Settings = ImageVector.Builder(
                name = "Settings",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(370f, 880f)
                    lineTo(354f, 752f)
                    quadTo(341f, 747f, 329.5f, 740f)
                    quadTo(318f, 733f, 307f, 725f)
                    lineTo(188f, 775f)
                    lineTo(78f, 585f)
                    lineTo(181f, 507f)
                    quadTo(180f, 500f, 180f, 493.5f)
                    quadTo(180f, 487f, 180f, 480f)
                    quadTo(180f, 473f, 180f, 466.5f)
                    quadTo(180f, 460f, 181f, 453f)
                    lineTo(78f, 375f)
                    lineTo(188f, 185f)
                    lineTo(307f, 235f)
                    quadTo(318f, 227f, 330f, 220f)
                    quadTo(342f, 213f, 354f, 208f)
                    lineTo(370f, 80f)
                    lineTo(590f, 80f)
                    lineTo(606f, 208f)
                    quadTo(619f, 213f, 630.5f, 220f)
                    quadTo(642f, 227f, 653f, 235f)
                    lineTo(772f, 185f)
                    lineTo(882f, 375f)
                    lineTo(779f, 453f)
                    quadTo(780f, 460f, 780f, 466.5f)
                    quadTo(780f, 473f, 780f, 480f)
                    quadTo(780f, 487f, 780f, 493.5f)
                    quadTo(780f, 500f, 778f, 507f)
                    lineTo(881f, 585f)
                    lineTo(771f, 775f)
                    lineTo(653f, 725f)
                    quadTo(642f, 733f, 630f, 740f)
                    quadTo(618f, 747f, 606f, 752f)
                    lineTo(590f, 880f)
                    lineTo(370f, 880f)
                    close()
                    moveTo(440f, 800f)
                    lineTo(519f, 800f)
                    lineTo(533f, 694f)
                    quadTo(564f, 686f, 590.5f, 670.5f)
                    quadTo(617f, 655f, 639f, 633f)
                    lineTo(738f, 674f)
                    lineTo(777f, 606f)
                    lineTo(691f, 541f)
                    quadTo(696f, 527f, 698f, 511.5f)
                    quadTo(700f, 496f, 700f, 480f)
                    quadTo(700f, 464f, 698f, 448.5f)
                    quadTo(696f, 433f, 691f, 419f)
                    lineTo(777f, 354f)
                    lineTo(738f, 286f)
                    lineTo(639f, 328f)
                    quadTo(617f, 305f, 590.5f, 289.5f)
                    quadTo(564f, 274f, 533f, 266f)
                    lineTo(520f, 160f)
                    lineTo(441f, 160f)
                    lineTo(427f, 266f)
                    quadTo(396f, 274f, 369.5f, 289.5f)
                    quadTo(343f, 305f, 321f, 327f)
                    lineTo(222f, 286f)
                    lineTo(183f, 354f)
                    lineTo(269f, 418f)
                    quadTo(264f, 433f, 262f, 448f)
                    quadTo(260f, 463f, 260f, 480f)
                    quadTo(260f, 496f, 262f, 511f)
                    quadTo(264f, 526f, 269f, 541f)
                    lineTo(183f, 606f)
                    lineTo(222f, 674f)
                    lineTo(321f, 632f)
                    quadTo(343f, 655f, 369.5f, 670.5f)
                    quadTo(396f, 686f, 427f, 694f)
                    lineTo(440f, 800f)
                    close()
                    moveTo(482f, 620f)
                    quadTo(540f, 620f, 581f, 579f)
                    quadTo(622f, 538f, 622f, 480f)
                    quadTo(622f, 422f, 581f, 381f)
                    quadTo(540f, 340f, 482f, 340f)
                    quadTo(423f, 340f, 382.5f, 381f)
                    quadTo(342f, 422f, 342f, 480f)
                    quadTo(342f, 538f, 382.5f, 579f)
                    quadTo(423f, 620f, 482f, 620f)
                    close()
                    moveTo(480f, 480f)
                    lineTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    lineTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    lineTo(480f, 480f)
                    close()
                }
            }.build()

            return _Settings!!
        }

    private var _Settings: ImageVector? = null

    val Calculate: ImageVector
        get() {
            if (_Calculator != null) {
                return _Calculator!!
            }
            _Calculator = ImageVector.Builder(
                name = "Calculate",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(320f, 720f)
                    lineTo(380f, 720f)
                    lineTo(380f, 640f)
                    lineTo(460f, 640f)
                    lineTo(460f, 580f)
                    lineTo(380f, 580f)
                    lineTo(380f, 500f)
                    lineTo(320f, 500f)
                    lineTo(320f, 580f)
                    lineTo(240f, 580f)
                    lineTo(240f, 640f)
                    lineTo(320f, 640f)
                    lineTo(320f, 720f)
                    close()
                    moveTo(520f, 690f)
                    lineTo(720f, 690f)
                    lineTo(720f, 630f)
                    lineTo(520f, 630f)
                    lineTo(520f, 690f)
                    close()
                    moveTo(520f, 590f)
                    lineTo(720f, 590f)
                    lineTo(720f, 530f)
                    lineTo(520f, 530f)
                    lineTo(520f, 590f)
                    close()
                    moveTo(564f, 438f)
                    lineTo(620f, 382f)
                    lineTo(676f, 438f)
                    lineTo(718f, 396f)
                    lineTo(662f, 338f)
                    lineTo(718f, 282f)
                    lineTo(676f, 240f)
                    lineTo(620f, 296f)
                    lineTo(564f, 240f)
                    lineTo(522f, 282f)
                    lineTo(578f, 338f)
                    lineTo(522f, 396f)
                    lineTo(564f, 438f)
                    close()
                    moveTo(250f, 368f)
                    lineTo(450f, 368f)
                    lineTo(450f, 308f)
                    lineTo(250f, 308f)
                    lineTo(250f, 368f)
                    close()
                    moveTo(200f, 840f)
                    quadTo(167f, 840f, 143.5f, 816.5f)
                    quadTo(120f, 793f, 120f, 760f)
                    lineTo(120f, 200f)
                    quadTo(120f, 167f, 143.5f, 143.5f)
                    quadTo(167f, 120f, 200f, 120f)
                    lineTo(760f, 120f)
                    quadTo(793f, 120f, 816.5f, 143.5f)
                    quadTo(840f, 167f, 840f, 200f)
                    lineTo(840f, 760f)
                    quadTo(840f, 793f, 816.5f, 816.5f)
                    quadTo(793f, 840f, 760f, 840f)
                    lineTo(200f, 840f)
                    close()
                    moveTo(200f, 760f)
                    lineTo(760f, 760f)
                    quadTo(760f, 760f, 760f, 760f)
                    quadTo(760f, 760f, 760f, 760f)
                    lineTo(760f, 200f)
                    quadTo(760f, 200f, 760f, 200f)
                    quadTo(760f, 200f, 760f, 200f)
                    lineTo(200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    lineTo(200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    close()
                    moveTo(200f, 200f)
                    lineTo(200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    lineTo(200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    lineTo(200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    lineTo(200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    close()
                }
            }.build()

            return _Calculator!!
        }

    private var _Calculator: ImageVector? = null

    val RiceBowl: ImageVector
        get() {
            if (_RiceBowl != null) {
                return _RiceBowl!!
            }
            _RiceBowl = ImageVector.Builder(
                name = "RiceBowl",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(320f, 880f)
                    lineTo(320f, 810f)
                    quadTo(215f, 768f, 147.5f, 680f)
                    quadTo(80f, 592f, 80f, 480f)
                    quadTo(80f, 397f, 111.5f, 324f)
                    quadTo(143f, 251f, 197f, 197f)
                    quadTo(251f, 143f, 324f, 111.5f)
                    quadTo(397f, 80f, 480f, 80f)
                    quadTo(563f, 80f, 636f, 111.5f)
                    quadTo(709f, 143f, 763f, 197f)
                    quadTo(817f, 251f, 848.5f, 324f)
                    quadTo(880f, 397f, 880f, 480f)
                    quadTo(880f, 592f, 812.5f, 680f)
                    quadTo(745f, 768f, 640f, 810f)
                    lineTo(640f, 880f)
                    lineTo(320f, 880f)
                    close()
                    moveTo(400f, 480f)
                    lineTo(560f, 480f)
                    lineTo(560f, 170f)
                    quadTo(540f, 165f, 520f, 162.5f)
                    quadTo(500f, 160f, 480f, 160f)
                    quadTo(460f, 160f, 440f, 162.5f)
                    quadTo(420f, 165f, 400f, 170f)
                    lineTo(400f, 480f)
                    close()
                    moveTo(160f, 480f)
                    lineTo(320f, 480f)
                    lineTo(320f, 203f)
                    quadTo(245f, 246f, 202.5f, 320f)
                    quadTo(160f, 394f, 160f, 480f)
                    close()
                    moveTo(640f, 480f)
                    lineTo(800f, 480f)
                    quadTo(800f, 394f, 757.5f, 320f)
                    quadTo(715f, 246f, 640f, 203f)
                    lineTo(640f, 480f)
                    close()
                    moveTo(400f, 800f)
                    lineTo(560f, 800f)
                    lineTo(560f, 756f)
                    quadTo(632f, 727f, 693f, 679.5f)
                    quadTo(754f, 632f, 784f, 560f)
                    lineTo(176f, 560f)
                    quadTo(206f, 632f, 267f, 679.5f)
                    quadTo(328f, 727f, 400f, 756f)
                    lineTo(400f, 800f)
                    close()
                    moveTo(400f, 800f)
                    lineTo(400f, 800f)
                    quadTo(400f, 800f, 400f, 800f)
                    quadTo(400f, 800f, 400f, 800f)
                    lineTo(560f, 800f)
                    quadTo(560f, 800f, 560f, 800f)
                    quadTo(560f, 800f, 560f, 800f)
                    lineTo(560f, 800f)
                    lineTo(400f, 800f)
                    close()
                }
            }.build()

            return _RiceBowl!!
        }

    private var _RiceBowl: ImageVector? = null

    val GlassCup: ImageVector
        get() {
            if (_GlassCup != null) {
                return _GlassCup!!
            }
            _GlassCup = ImageVector.Builder(
                name = "GlassCup",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(279f, 880f)
                    quadTo(248f, 880f, 225.5f, 860f)
                    quadTo(203f, 840f, 200f, 809f)
                    lineTo(120f, 80f)
                    lineTo(840f, 80f)
                    lineTo(760f, 809f)
                    quadTo(757f, 840f, 734.5f, 860f)
                    quadTo(712f, 880f, 681f, 880f)
                    lineTo(279f, 880f)
                    close()
                    moveTo(271f, 720f)
                    lineTo(280f, 800f)
                    quadTo(280f, 800f, 280f, 800f)
                    quadTo(280f, 800f, 280f, 800f)
                    lineTo(680f, 800f)
                    quadTo(680f, 800f, 680f, 800f)
                    quadTo(680f, 800f, 680f, 800f)
                    lineTo(689f, 720f)
                    lineTo(271f, 720f)
                    close()
                    moveTo(263f, 640f)
                    lineTo(698f, 640f)
                    lineTo(750f, 160f)
                    lineTo(210f, 160f)
                    lineTo(263f, 640f)
                    close()
                    moveTo(271f, 800f)
                    lineTo(689f, 800f)
                    lineTo(680f, 800f)
                    quadTo(680f, 800f, 680f, 800f)
                    quadTo(680f, 800f, 680f, 800f)
                    lineTo(280f, 800f)
                    quadTo(280f, 800f, 280f, 800f)
                    quadTo(280f, 800f, 280f, 800f)
                    lineTo(271f, 800f)
                    close()
                }
            }.build()

            return _GlassCup!!
        }

    private var _GlassCup: ImageVector? = null

    val ArrowDropdown: ImageVector
        get() {
            if (_ArrowDropdown != null) {
                return _ArrowDropdown!!
            }
            _ArrowDropdown = ImageVector.Builder(
                name = "ArrowDropdown",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(480f, 600f)
                    lineTo(280f, 400f)
                    lineTo(680f, 400f)
                    lineTo(480f, 600f)
                    close()
                }
            }.build()

            return _ArrowDropdown!!
        }

    private var _ArrowDropdown: ImageVector? = null

    val Blender: ImageVector
        get() {
            if (_Blender != null) return _Blender!!

            _Blender = ImageVector.Builder(
                name = "Blender",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(320f, 880f)
                    quadToRelative(-33f, 0f, -56.5f, -23.5f)
                    reflectiveQuadTo(240f, 800f)
                    verticalLineToRelative(-40f)
                    quadToRelative(0f, -47f, 20.5f, -87f)
                    reflectiveQuadToRelative(53.5f, -67f)
                    lineToRelative(-25f, -166f)
                    horizontalLineToRelative(-89f)
                    quadToRelative(-33f, 0f, -56.5f, -23.5f)
                    reflectiveQuadTo(120f, 360f)
                    verticalLineToRelative(-160f)
                    quadToRelative(0f, -33f, 23.5f, -56.5f)
                    reflectiveQuadTo(200f, 120f)
                    horizontalLineToRelative(200f)
                    verticalLineToRelative(-40f)
                    horizontalLineToRelative(160f)
                    verticalLineToRelative(40f)
                    horizontalLineToRelative(159f)
                    lineToRelative(-73f, 486f)
                    quadToRelative(33f, 27f, 53.5f, 67f)
                    reflectiveQuadToRelative(20.5f, 87f)
                    verticalLineToRelative(40f)
                    quadToRelative(0f, 33f, -23.5f, 56.5f)
                    reflectiveQuadTo(640f, 880f)
                    close()
                    moveToRelative(-43f, -520f)
                    lineToRelative(-24f, -160f)
                    horizontalLineToRelative(-53f)
                    verticalLineToRelative(160f)
                    close()
                    moveToRelative(203f, 400f)
                    quadToRelative(17f, 0f, 28.5f, -11.5f)
                    reflectiveQuadTo(520f, 720f)
                    reflectiveQuadToRelative(-11.5f, -28.5f)
                    reflectiveQuadTo(480f, 680f)
                    reflectiveQuadToRelative(-28.5f, 11.5f)
                    reflectiveQuadTo(440f, 720f)
                    reflectiveQuadToRelative(11.5f, 28.5f)
                    reflectiveQuadTo(480f, 760f)
                    moveToRelative(-92f, -200f)
                    horizontalLineToRelative(184f)
                    lineToRelative(54f, -360f)
                    horizontalLineTo(334f)
                    close()
                    moveToRelative(-68f, 240f)
                    horizontalLineToRelative(320f)
                    verticalLineToRelative(-40f)
                    quadToRelative(0f, -50f, -35f, -85f)
                    reflectiveQuadToRelative(-85f, -35f)
                    horizontalLineToRelative(-80f)
                    quadToRelative(-50f, 0f, -85f, 35f)
                    reflectiveQuadToRelative(-35f, 85f)
                    close()
                    moveToRelative(160f, -80f)
                }
            }.build()

            return _Blender!!
        }

    private var _Blender: ImageVector? = null

    val Delete: ImageVector
        get() {
            if (_Delete != null) {
                return _Delete!!
            }
            _Delete = ImageVector.Builder(
                name = "Delete",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(280f, 840f)
                    quadTo(247f, 840f, 223.5f, 816.5f)
                    quadTo(200f, 793f, 200f, 760f)
                    lineTo(200f, 240f)
                    lineTo(160f, 240f)
                    lineTo(160f, 160f)
                    lineTo(360f, 160f)
                    lineTo(360f, 120f)
                    lineTo(600f, 120f)
                    lineTo(600f, 160f)
                    lineTo(800f, 160f)
                    lineTo(800f, 240f)
                    lineTo(760f, 240f)
                    lineTo(760f, 760f)
                    quadTo(760f, 793f, 736.5f, 816.5f)
                    quadTo(713f, 840f, 680f, 840f)
                    lineTo(280f, 840f)
                    close()
                    moveTo(680f, 240f)
                    lineTo(280f, 240f)
                    lineTo(280f, 760f)
                    quadTo(280f, 760f, 280f, 760f)
                    quadTo(280f, 760f, 280f, 760f)
                    lineTo(680f, 760f)
                    quadTo(680f, 760f, 680f, 760f)
                    quadTo(680f, 760f, 680f, 760f)
                    lineTo(680f, 240f)
                    close()
                    moveTo(360f, 680f)
                    lineTo(440f, 680f)
                    lineTo(440f, 320f)
                    lineTo(360f, 320f)
                    lineTo(360f, 680f)
                    close()
                    moveTo(520f, 680f)
                    lineTo(600f, 680f)
                    lineTo(600f, 320f)
                    lineTo(520f, 320f)
                    lineTo(520f, 680f)
                    close()
                    moveTo(280f, 240f)
                    lineTo(280f, 240f)
                    lineTo(280f, 760f)
                    quadTo(280f, 760f, 280f, 760f)
                    quadTo(280f, 760f, 280f, 760f)
                    lineTo(280f, 760f)
                    quadTo(280f, 760f, 280f, 760f)
                    quadTo(280f, 760f, 280f, 760f)
                    lineTo(280f, 240f)
                    close()
                }
            }.build()

            return _Delete!!
        }

    private var _Delete: ImageVector? = null

    val Edit: ImageVector
        get() {
            if (_Edit != null) {
                return _Edit!!
            }
            _Edit = ImageVector.Builder(
                name = "Edit",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(200f, 760f)
                    lineTo(257f, 760f)
                    lineTo(648f, 369f)
                    lineTo(591f, 312f)
                    lineTo(200f, 703f)
                    lineTo(200f, 760f)
                    close()
                    moveTo(120f, 840f)
                    lineTo(120f, 670f)
                    lineTo(648f, 143f)
                    quadTo(660f, 132f, 674.5f, 126f)
                    quadTo(689f, 120f, 705f, 120f)
                    quadTo(721f, 120f, 736f, 126f)
                    quadTo(751f, 132f, 762f, 144f)
                    lineTo(817f, 200f)
                    quadTo(829f, 211f, 834.5f, 226f)
                    quadTo(840f, 241f, 840f, 256f)
                    quadTo(840f, 272f, 834.5f, 286.5f)
                    quadTo(829f, 301f, 817f, 313f)
                    lineTo(290f, 840f)
                    lineTo(120f, 840f)
                    close()
                    moveTo(760f, 256f)
                    lineTo(760f, 256f)
                    lineTo(704f, 200f)
                    lineTo(704f, 200f)
                    lineTo(760f, 256f)
                    close()
                    moveTo(619f, 341f)
                    lineTo(591f, 312f)
                    lineTo(591f, 312f)
                    lineTo(648f, 369f)
                    lineTo(648f, 369f)
                    lineTo(619f, 341f)
                    close()
                }
            }.build()

            return _Edit!!
        }

    private var _Edit: ImageVector? = null

    val List: ImageVector
        get() {
            if (_List != null) {
                return _List!!
            }
            _List = ImageVector.Builder(
                name = "List",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f,
                autoMirror = true
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(80f, 800f)
                    lineTo(80f, 640f)
                    lineTo(240f, 640f)
                    lineTo(240f, 800f)
                    lineTo(80f, 800f)
                    close()
                    moveTo(320f, 800f)
                    lineTo(320f, 640f)
                    lineTo(880f, 640f)
                    lineTo(880f, 800f)
                    lineTo(320f, 800f)
                    close()
                    moveTo(80f, 560f)
                    lineTo(80f, 400f)
                    lineTo(240f, 400f)
                    lineTo(240f, 560f)
                    lineTo(80f, 560f)
                    close()
                    moveTo(320f, 560f)
                    lineTo(320f, 400f)
                    lineTo(880f, 400f)
                    lineTo(880f, 560f)
                    lineTo(320f, 560f)
                    close()
                    moveTo(80f, 320f)
                    lineTo(80f, 160f)
                    lineTo(240f, 160f)
                    lineTo(240f, 320f)
                    lineTo(80f, 320f)
                    close()
                    moveTo(320f, 320f)
                    lineTo(320f, 160f)
                    lineTo(880f, 160f)
                    lineTo(880f, 320f)
                    lineTo(320f, 320f)
                    close()
                }
            }.build()

            return _List!!
        }

    private var _List: ImageVector? = null

    val OutlinedList: ImageVector
        get() {
            if (_OutlinedList != null) {
                return _OutlinedList!!
            }
            _OutlinedList = ImageVector.Builder(
                name = "OutlinedList",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f,
                autoMirror = true
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(360f, 720f)
                    lineTo(800f, 720f)
                    quadTo(800f, 720f, 800f, 720f)
                    quadTo(800f, 720f, 800f, 720f)
                    lineTo(800f, 613f)
                    lineTo(360f, 613f)
                    lineTo(360f, 720f)
                    close()
                    moveTo(160f, 347f)
                    lineTo(280f, 347f)
                    lineTo(280f, 240f)
                    lineTo(160f, 240f)
                    quadTo(160f, 240f, 160f, 240f)
                    quadTo(160f, 240f, 160f, 240f)
                    lineTo(160f, 347f)
                    close()
                    moveTo(160f, 534f)
                    lineTo(280f, 534f)
                    lineTo(280f, 427f)
                    lineTo(160f, 427f)
                    lineTo(160f, 534f)
                    close()
                    moveTo(160f, 720f)
                    lineTo(280f, 720f)
                    lineTo(280f, 613f)
                    lineTo(160f, 613f)
                    lineTo(160f, 720f)
                    quadTo(160f, 720f, 160f, 720f)
                    quadTo(160f, 720f, 160f, 720f)
                    close()
                    moveTo(360f, 534f)
                    lineTo(800f, 534f)
                    lineTo(800f, 427f)
                    lineTo(360f, 427f)
                    lineTo(360f, 534f)
                    close()
                    moveTo(360f, 347f)
                    lineTo(800f, 347f)
                    lineTo(800f, 240f)
                    quadTo(800f, 240f, 800f, 240f)
                    quadTo(800f, 240f, 800f, 240f)
                    lineTo(360f, 240f)
                    lineTo(360f, 347f)
                    close()
                    moveTo(160f, 800f)
                    quadTo(127f, 800f, 103.5f, 776.5f)
                    quadTo(80f, 753f, 80f, 720f)
                    lineTo(80f, 240f)
                    quadTo(80f, 207f, 103.5f, 183.5f)
                    quadTo(127f, 160f, 160f, 160f)
                    lineTo(800f, 160f)
                    quadTo(833f, 160f, 856.5f, 183.5f)
                    quadTo(880f, 207f, 880f, 240f)
                    lineTo(880f, 720f)
                    quadTo(880f, 753f, 856.5f, 776.5f)
                    quadTo(833f, 800f, 800f, 800f)
                    lineTo(160f, 800f)
                    close()
                }
            }.build()

            return _OutlinedList!!
        }

    private var _OutlinedList: ImageVector? = null

    val Save: ImageVector
        get() {
            if (_Save != null) {
                return _Save!!
            }
            _Save = ImageVector.Builder(
                name = "Save",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(840f, 280f)
                    lineTo(840f, 760f)
                    quadTo(840f, 793f, 816.5f, 816.5f)
                    quadTo(793f, 840f, 760f, 840f)
                    lineTo(200f, 840f)
                    quadTo(167f, 840f, 143.5f, 816.5f)
                    quadTo(120f, 793f, 120f, 760f)
                    lineTo(120f, 200f)
                    quadTo(120f, 167f, 143.5f, 143.5f)
                    quadTo(167f, 120f, 200f, 120f)
                    lineTo(680f, 120f)
                    lineTo(840f, 280f)
                    close()
                    moveTo(760f, 314f)
                    lineTo(646f, 200f)
                    lineTo(200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    lineTo(200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    lineTo(760f, 760f)
                    quadTo(760f, 760f, 760f, 760f)
                    quadTo(760f, 760f, 760f, 760f)
                    lineTo(760f, 314f)
                    close()
                    moveTo(480f, 720f)
                    quadTo(530f, 720f, 565f, 685f)
                    quadTo(600f, 650f, 600f, 600f)
                    quadTo(600f, 550f, 565f, 515f)
                    quadTo(530f, 480f, 480f, 480f)
                    quadTo(430f, 480f, 395f, 515f)
                    quadTo(360f, 550f, 360f, 600f)
                    quadTo(360f, 650f, 395f, 685f)
                    quadTo(430f, 720f, 480f, 720f)
                    close()
                    moveTo(240f, 400f)
                    lineTo(600f, 400f)
                    lineTo(600f, 240f)
                    lineTo(240f, 240f)
                    lineTo(240f, 400f)
                    close()
                    moveTo(200f, 314f)
                    lineTo(200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    lineTo(200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    quadTo(200f, 760f, 200f, 760f)
                    lineTo(200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    quadTo(200f, 200f, 200f, 200f)
                    lineTo(200f, 200f)
                    lineTo(200f, 314f)
                    close()
                }
            }.build()

            return _Save!!
        }

    private var _Save: ImageVector? = null

    val Error: ImageVector
        get() {
            if (_Error != null) {
                return _Error!!
            }
            _Error = ImageVector.Builder(
                name = "Error",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(480f, 680f)
                    quadTo(497f, 680f, 508.5f, 668.5f)
                    quadTo(520f, 657f, 520f, 640f)
                    quadTo(520f, 623f, 508.5f, 611.5f)
                    quadTo(497f, 600f, 480f, 600f)
                    quadTo(463f, 600f, 451.5f, 611.5f)
                    quadTo(440f, 623f, 440f, 640f)
                    quadTo(440f, 657f, 451.5f, 668.5f)
                    quadTo(463f, 680f, 480f, 680f)
                    close()
                    moveTo(440f, 520f)
                    lineTo(520f, 520f)
                    lineTo(520f, 280f)
                    lineTo(440f, 280f)
                    lineTo(440f, 520f)
                    close()
                    moveTo(480f, 880f)
                    quadTo(397f, 880f, 324f, 848.5f)
                    quadTo(251f, 817f, 197f, 763f)
                    quadTo(143f, 709f, 111.5f, 636f)
                    quadTo(80f, 563f, 80f, 480f)
                    quadTo(80f, 397f, 111.5f, 324f)
                    quadTo(143f, 251f, 197f, 197f)
                    quadTo(251f, 143f, 324f, 111.5f)
                    quadTo(397f, 80f, 480f, 80f)
                    quadTo(563f, 80f, 636f, 111.5f)
                    quadTo(709f, 143f, 763f, 197f)
                    quadTo(817f, 251f, 848.5f, 324f)
                    quadTo(880f, 397f, 880f, 480f)
                    quadTo(880f, 563f, 848.5f, 636f)
                    quadTo(817f, 709f, 763f, 763f)
                    quadTo(709f, 817f, 636f, 848.5f)
                    quadTo(563f, 880f, 480f, 880f)
                    close()
                    moveTo(480f, 800f)
                    quadTo(614f, 800f, 707f, 707f)
                    quadTo(800f, 614f, 800f, 480f)
                    quadTo(800f, 346f, 707f, 253f)
                    quadTo(614f, 160f, 480f, 160f)
                    quadTo(346f, 160f, 253f, 253f)
                    quadTo(160f, 346f, 160f, 480f)
                    quadTo(160f, 614f, 253f, 707f)
                    quadTo(346f, 800f, 480f, 800f)
                    close()
                    moveTo(480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    quadTo(480f, 480f, 480f, 480f)
                    close()
                }
            }.build()

            return _Error!!
        }

    private var _Error: ImageVector? = null
}
