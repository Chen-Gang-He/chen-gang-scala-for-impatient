package com.chengang

import java.util

/**
  * Created by che on 9/22/2018.
  */
object Test {
  println("Test")
  class FileListConverter extends IStringConverter[JavaList[String]] {
    override def convert(data_instance_names: String): JavaList[String] = {
      scala.collection.JavaConversions.seqAsJavaList(data_instance_names.split(",").map(_.trim).toSeq)

    }
  }

  class LogLevelValidator extends IParameterValidator {
    @throws[ParameterException]
    override def validate(name: String, value: String): Unit = {
      if (!VALID_LOG_LEVEL.contains(value.trim.toUpperCase))
        throw new ParameterException("Parameter " + name + s" is $value, valid values should be $VALID_LOG_LEVEL !!!")
    }
  }

  class Args {
    @Parameter(names = Array("-t", "--is_trim"),
      description = "indicates if we need to trim leading and trail whitespace for each column. ",
      required = false)
    var isTrim = true

    @Parameter(names = Array("-u", "--is_uppercase"),
      description = "indicates if we need to capitalize value for each column.",
      required = false)
    var isUpperCase = false

    @Parameter(names = Array("-n", "--is_set_blank_2_null"),
      description = "indicates if we need to capitalize value for each column.",
      required = false)
    var isSetBlank2Null = false

    @Parameter(names = Array("-c", "--is_chop_milliseconds"),
      description = "indicates if we need to chop milliseconds.",
      required = false)
    var isChopMillisecond = false

    @Parameter(names = Array("-s", "--data_instance_names"), listConverter = classOf[FileListConverter],
      description = "Comma-separated list of data instance names registered in the table 'data_obj_regis_evnt'",
      required = false)
    var dataInstances: util.List[String] = _

    @Parameter(names = Array("-l", "--spark_log_level"),
      description = "Stands for what logging level should be enabled for Spark. Valid values should be INFO, DEBUG, TRACE, ERROR, ERROR",
      validateWith = Array(classOf[LogLevelValidator]), required = false)
    var sparkLogLevel = "DEBUG"

    @Parameter(names = Array("-o", "--data_object_id"),
      description = " data object id to be staged which is defined in meta table 'data_obj'",
      required = true)
    var dataObjectId: Int = _

    @Parameter(names = Array("-m", "--is_enable_metrics"),
      description = "Indicates if Spark streaming query listener which dumps metrics to the meta table 'data_mapg_evnt' will be enabled",
      required = true)
    var is_enable_metrics = false

    @Parameter(names = Array("-h", "--help"), description = "Show this help screen", help = true)
    var help: Boolean = _

  }

  def main(args: Array[String]): Unit = {
    val args = new Args()
    val jc = JCommander.newBuilder.addObject(args).build
    try {
      jc.parse(argv: _*)
    } catch {
      case ex: Exception =>
        ex.printStackTrace()
        println()
        jc.usage()
        sys.exit(2)
    }
    if (args.help) {
      jc.usage()
      sys.exit(0)
    }
  }

}
