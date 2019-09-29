package route

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.routing.Routing
import io.ktor.routing.route
import route.v1.health
import route.v1.examples

@KtorExperimentalLocationsAPI
fun Routing.root() {
    route("v1") {
        health()
        examples()
    }
}