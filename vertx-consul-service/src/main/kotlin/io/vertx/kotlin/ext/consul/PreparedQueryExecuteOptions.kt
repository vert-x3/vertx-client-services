package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.PreparedQueryExecuteOptions

fun PreparedQueryExecuteOptions(
  limit: Int? = null,
  near: String? = null): PreparedQueryExecuteOptions = io.vertx.ext.consul.PreparedQueryExecuteOptions().apply {

  if (limit != null) {
    this.setLimit(limit)
  }
  if (near != null) {
    this.setNear(near)
  }
}

