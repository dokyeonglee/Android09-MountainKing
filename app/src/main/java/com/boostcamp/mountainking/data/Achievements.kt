package com.boostcamp.mountainking.data

import com.boostcamp.mountainking.entity.Achievement
import com.boostcamp.mountainking.entity.AchievementType

fun getInitAchievementList(): List<Achievement> {
    return listOf(
        Achievement(
            id = 0,
            name = "지리산 반달곰",
            description = "지리산을 10회 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_COUNT,
            curProgress = 0,
            maxProgress = 10,
            isComplete = false,
            completeDate = null,
            score = 100,
            typeArgument = 0,
        ),
        Achievement(
            id = 1,
            name = "콩밭 매는 아낙네",
            description = "칠갑산을 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_COUNT,
            curProgress = 0,
            maxProgress = 1,
            isComplete = false,
            completeDate = null,
            score = 10,
            typeArgument = 1
        ),
        Achievement(
            id = 2,
            name = "학교세요?",
            description = "50회 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.TRACKING_TOTAL_COUNT,
            curProgress = 0,
            maxProgress = 50,
            isComplete = false,
            completeDate = null,
            score = 300
        ),
        Achievement(
            id = 3,
            name = "이방원의 환생",
            description = "만수산을 10회 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_COUNT,
            curProgress = 0,
            maxProgress = 10,
            isComplete = false,
            completeDate = null,
            score = 100,
            typeArgument = 2,
        ),
        Achievement(
            id = 4,
            name = "산 넘어 산",
            description = "2일 안에 2번 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.TRACKING_PERIOD_COUNT,
            curProgress = 0,
            maxProgress = 2,
            isComplete = false,
            completeDate = null,
            score = 50,
            typeArgument = 2,
        ),
        Achievement(
            id = 5,
            name = "흐에!",
            description = "기백산을 5회 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_COUNT,
            curProgress = 0,
            maxProgress = 5,
            isComplete = false,
            completeDate = null,
            score = 50,
            typeArgument = 3,
        ),
        Achievement(
            id = 6,
            name = "수헬리베붕탄질산",
            description = "화학산을 7회 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_COUNT,
            curProgress = 0,
            maxProgress = 7,
            isComplete = false,
            completeDate = null,
            score = 70,
            typeArgument = 4,
        ),
        Achievement(
            id = 7,
            name = "홍길동",
            description = "전체 등산 거리 100km 이상",
            thumbnailUrl = "",
            type = AchievementType.TRACKING_TOTAL_DISTANCE,
            curProgress = 0,
            maxProgress = 100,
            isComplete = false,
            completeDate = null,
            score = 100,
        ),
        Achievement(
            id = 8,
            name = "등산왕",
            description = "100대 명산을 10군데 이상 등산하세요",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_KIND_COUNT,
            curProgress = 0,
            maxProgress = 10,
            isComplete = false,
            completeDate = null,
            score = 100,
            typeArgument = List(100) { it }
        ),
        Achievement(
            id = 9,
            name = "환웅",
            description = "태백산 등산 100회 이상",
            thumbnailUrl = "",
            type = AchievementType.MOUNTAIN_COUNT,
            curProgress = 0,
            maxProgress = 100,
            isComplete = false,
            completeDate = null,
            score = 1000,
            typeArgument = 5
        ),
    )
}