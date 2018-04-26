package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.NodeList
import io.vertx.ext.consul.Node

fun NodeList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Node>? = null): NodeList = io.vertx.ext.consul.NodeList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

