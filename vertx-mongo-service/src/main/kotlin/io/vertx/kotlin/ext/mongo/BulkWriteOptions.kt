package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.BulkWriteOptions
import io.vertx.ext.mongo.WriteOption

fun BulkWriteOptions(
  ordered: Boolean? = null,
  writeOption: WriteOption? = null): BulkWriteOptions = io.vertx.ext.mongo.BulkWriteOptions().apply {

  if (ordered != null) {
    this.setOrdered(ordered)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

