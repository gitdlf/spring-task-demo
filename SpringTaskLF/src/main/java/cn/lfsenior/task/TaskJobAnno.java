package cn.lfsenior.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskJobAnno {
	@Scheduled(cron="0 * * * * ?")
	public void job(){
		System.out.println("任务进行中.....Anno"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
