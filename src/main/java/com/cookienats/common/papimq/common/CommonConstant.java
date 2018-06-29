package com.cookienats.common.papimq.common;

public class CommonConstant {

    //消息队列每个分区最多消息数
    public static final Integer REGION_MAX_MESSAGE_COUNTS = 5;

    //存储topic信息hash，key->topicName value->topicEntityByte
    public static final String REDIS_TOPIC_HASH_MAP = "TOPIC_HASH_MAP";

    //topic对应消息队列，eg MESSAGE_LIST_${topicName}_${region} -> List<MessageEntity>
    public static final String REDIS_MESSAGE_LIST_PREFIX = "MESSAGE_LIST_";

    //存储topic与subscriber关系hash
    public static final String REDIS_RELATION_HASH_MAP = "RELATION_HASH_MAP";

    //eg RELATION_HASH_MAP_${topicName}_${subscriberName} -> RelationByte
    public static final String REDIS_RELATION_HASH_KEY_PREFIX = "RELATION_HASH_KEY_";

    //存储订阅者hash key->subscriberName value->subscriberByte
    public static final String REDIS_SUBSCRIBER_HASH_MAP = "SUBSCRIBER_HASH_MAP";

    //存储消费者requestId
    public static final String REDIS_REQUESTID_HASH_MAP = "REQUESTID_HASH_MAP";

    //requestId缓存时间
    public static final Integer REQUESTID_EXPIRE_TIME = 60;

    //RedisLock锁定key前缀
    public static final String REDIS_LOCK_KEY_PREFIX = "LOCK_KEY_PREFIX_";
}
