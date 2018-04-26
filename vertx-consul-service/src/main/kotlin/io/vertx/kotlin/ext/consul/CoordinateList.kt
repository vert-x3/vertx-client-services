package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CoordinateList
import io.vertx.ext.consul.Coordinate

fun CoordinateList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Coordinate>? = null): CoordinateList = io.vertx.ext.consul.CoordinateList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

