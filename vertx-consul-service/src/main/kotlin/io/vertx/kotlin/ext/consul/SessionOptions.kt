package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.SessionOptions
import io.vertx.ext.consul.SessionBehavior

fun SessionOptions(
  behavior: SessionBehavior? = null,
  checks: Iterable<String>? = null,
  lockDelay: Long? = null,
  name: String? = null,
  node: String? = null,
  ttl: Long? = null): SessionOptions = io.vertx.ext.consul.SessionOptions().apply {

  if (behavior != null) {
    this.setBehavior(behavior)
  }
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (ttl != null) {
    this.setTtl(ttl)
  }
}

