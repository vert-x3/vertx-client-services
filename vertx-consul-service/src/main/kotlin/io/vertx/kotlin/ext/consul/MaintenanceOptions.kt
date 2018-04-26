package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.MaintenanceOptions

fun MaintenanceOptions(
  enable: Boolean? = null,
  id: String? = null,
  reason: String? = null): MaintenanceOptions = io.vertx.ext.consul.MaintenanceOptions().apply {

  if (enable != null) {
    this.setEnable(enable)
  }
  if (id != null) {
    this.setId(id)
  }
  if (reason != null) {
    this.setReason(reason)
  }
}

