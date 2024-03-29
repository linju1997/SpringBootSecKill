package me.fengkmm.seckill.dto;

import lombok.Data;
import lombok.ToString;
import me.fengkmm.seckill.entity.SuccessSecKilled;
import me.fengkmm.seckill.enums.SecKillStatEnum;

/**
 * 封装秒杀执行后结果
 * @author Administrator
 */
@Data
@ToString
public class SecKillExecution {
    /**
     * 秒杀的商品ID
     */
    private long seckillId;
    /**
     * 秒杀执行结果状态
     */
    private long state;
    /**
     * 状态表示
     */
    private String stateInfo;
    /**
     * 秒杀成功对象
     */
    private SuccessSecKilled successSecKilled;


    public SecKillExecution(long seckillId, SecKillStatEnum secKillStatEnum, SuccessSecKilled successSecKilled) {
        this.seckillId = seckillId;
        this.state = secKillStatEnum.getState();
        this.stateInfo = secKillStatEnum.getStateInfo();
        this.successSecKilled = successSecKilled;
    }
}
