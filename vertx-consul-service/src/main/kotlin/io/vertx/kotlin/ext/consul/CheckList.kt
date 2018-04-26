package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckList
import io.vertx.ext.consul.Check

fun CheckList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Check>? = null): CheckList = io.vertx.ext.consul.CheckList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

