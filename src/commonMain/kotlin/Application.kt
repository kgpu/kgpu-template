import io.github.kgpu.Kgpu
import io.github.kgpu.Window

object Application {
    val TITLE = "Application Title Here"

    fun run(){
        val window = Window()
        window.setTitle(TITLE)

        Kgpu.runLoop(window){
            
        }
    }
}