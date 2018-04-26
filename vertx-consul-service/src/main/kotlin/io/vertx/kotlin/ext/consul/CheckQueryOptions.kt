package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

fun CheckQueryOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null): CheckQueryOptions = io.vertx.ext.consul.CheckQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

