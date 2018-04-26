package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.DcCoordinates
import io.vertx.ext.consul.Coordinate

fun DcCoordinates(
  datacenter: String? = null,
  servers: Iterable<io.vertx.ext.consul.Coordinate>? = null): DcCoordinates = io.vertx.ext.consul.DcCoordinates().apply {

  if (datacenter != null) {
    this.setDatacenter(datacenter)
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

