package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

fun ServiceQueryOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null,
  tag: String? = null): ServiceQueryOptions = io.vertx.ext.consul.ServiceQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

