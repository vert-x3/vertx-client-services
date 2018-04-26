package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Node

fun Node(
  address: String? = null,
  lanAddress: String? = null,
  name: String? = null,
  wanAddress: String? = null): Node = io.vertx.ext.consul.Node().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (lanAddress != null) {
    this.setLanAddress(lanAddress)
  }
  if (name != null) {
    this.setName(name)
  }
  if (wanAddress != null) {
    this.setWanAddress(wanAddress)
  }
}

