package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValue

fun KeyValue(
  createIndex: Long? = null,
  flags: Long? = null,
  key: String? = null,
  lockIndex: Long? = null,
  modifyIndex: Long? = null,
  session: String? = null,
  value: String? = null): KeyValue = io.vertx.ext.consul.KeyValue().apply {

  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (key != null) {
    this.setKey(key)
  }
  if (lockIndex != null) {
    this.setLockIndex(lockIndex)
  }
  if (modifyIndex != null) {
    this.setModifyIndex(modifyIndex)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (value != null) {
    this.setValue(value)
  }
}

