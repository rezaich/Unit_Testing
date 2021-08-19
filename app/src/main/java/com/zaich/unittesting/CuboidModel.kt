package com.zaich.unittesting

class CuboidModel {
    private var length : Double = 0.0
    private var width : Double = 0.0
    private var height : Double = 0.0

    fun save(length : Double , width: Double , height : Double){
            this.length = length
            this.width = width
            this.height = height
    }

    fun getVolume():Double = length * width * height

    fun getSurfaceArea():Double {
        val lw = length * width
        val lh = length * height
        val wh = width * height

        return 2 * (lw+lh+wh)
    }

    fun getCircumference():Double = 4*(width+height+height)

}