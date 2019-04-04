package cs455.hadoop.statistics;

import java.util.Scanner;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Mapper: Reads line by line, split them into words. Emit <word, 1> pairs.
 */
public class StatisticsMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

  @Override
  protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
    // tokenize into words.
    //StringTokenizer itr = new StringTokenizer(value.toString());

    Scanner scan = new Scanner(value.toString());
    while (scan.hasNextLine()) {

    }

    // emit word, count pairs.
    //while (itr.hasMoreTokens()) {
    //  context.write(new Text(itr.nextToken()), new IntWritable(1));
    //}
    scan.close();
  }
}



