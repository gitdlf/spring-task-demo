package cn.lfsenior.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TaskJob {
	public void jodb1(){
		System.out.println("任务进行中....."+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
