package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValueOptions

fun KeyValueOptions(
  acquireSession: String? = null,
  casIndex: Long? = null,
  flags: Long? = null,
  releaseSession: String? = null): KeyValueOptions = io.vertx.ext.consul.KeyValueOptions().apply {

  if (acquireSession != null) {
    this.setAcquireSession(acquireSession)
  }
  if (casIndex != null) {
    this.setCasIndex(casIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (releaseSession != null) {
    this.setReleaseSession(releaseSession)
  }
}

