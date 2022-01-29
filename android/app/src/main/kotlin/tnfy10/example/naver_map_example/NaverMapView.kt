package tnfy10.example.naver_map_example

import android.content.Context
import android.view.View
import com.naver.maps.map.MapView
import io.flutter.plugin.platform.PlatformView

internal class NaverMapView(context: Context, id: Int, creationParams: Map<String?, Any?>?) :
    PlatformView {
    private val mapView: MapView = MapView(context)

    override fun getView(): View {
        return mapView
    }

    override fun dispose() {}

    init {

    }
}