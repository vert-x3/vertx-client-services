package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Session

fun Session(
  checks: Iterable<String>? = null,
  createIndex: Long? = null,
  id: String? = null,
  index: Long? = null,
  lockDelay: Long? = null,
  node: String? = null): Session = io.vertx.ext.consul.Session().apply {

  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (id != null) {
    this.setId(id)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (node != null) {
    this.setNode(node)
  }
}

