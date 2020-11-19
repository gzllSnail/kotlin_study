import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

//图片处理
fun main() {
    //宽高一百的 图片
    val image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    val w = 0..99
    val h = 0..99

//    image.setRGB(0, 0, 0xff0000)
    image.apply {
        for (i in w) {
            for (j in h) {
                setRGB(i, j, 0xff00ff)
            }
        }
    }
    ImageIO.write(image, "bmp", File("a.bmp"))
}