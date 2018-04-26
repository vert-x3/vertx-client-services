package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Coordinate

fun Coordinate(
  adj: Float? = null,
  err: Float? = null,
  height: Float? = null,
  node: String? = null,
  vec: Iterable<Float>? = null): Coordinate = io.vertx.ext.consul.Coordinate().apply {

  if (adj != null) {
    this.setAdj(adj)
  }
  if (err != null) {
    this.setErr(err)
  }
  if (height != null) {
    this.setHeight(height)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (vec != null) {
    this.setVec(vec.toList())
  }
}

