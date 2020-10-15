import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions

object Hi {

  //var format: String[String] = None
  //var file_path: String[String] = None

  def main(args: Array[String]): Unit = {
    
    val spark = SparkSession.builder.appName("app").getOrCreate()

    val df = spark.read
                  .format(args(0))
                  .option("header", "true")
                  .option("inferSchema", "true")
                  .load(args(1))
      
    val header = df.columns.toList
    val stats = df.describe()
    val schema = df.schema
    val preview = df.limit(100)
    
    println(header, stats, schema, preview)

    spark.stop()
    
    }
}