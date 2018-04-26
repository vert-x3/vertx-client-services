package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.NodeQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

fun NodeQueryOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null): NodeQueryOptions = io.vertx.ext.consul.NodeQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

