package com.synthetic.kotlincourse.lesson3

val eventName: String = "Hackathon Survival" //Название мероприятия

var eventDate: String = "13.09.2024" //Дата проведения

val eventPlace: String = "DK Uriupinsk" //Место проведения

private var budget: String = {
    val rentalOfRoom: Double = 299.99
    val rentalOfHardware: Double = 199.99
    var cathering: Double = 99.99
    var security: Double = 69.99
    var prizes: String = "iPad, iPhone, Money"
    var other: } //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.

var quantityOfParticipates: Int = 0
    get() = field
    private set(value) {field=value} //Количество участников

var duration: Int = 360 //Длительность хакатона

private val contacts: String = "+79009990099 Inga"//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.

var status: String = "Не начат" //Текущее состояние хакатона (статус)

var sponsors: String = "Спонсоры" //Список спонсоров

lateinit var wholeBudget: String // Бюджет мероприятия

var internetLevel: Int = 5 //Текущий уровень доступа к интернету

var deliveryOfStuff: String = ""  // Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

var quantityOfTeams: Int = 5 //Количество команд

val tasks: String = "Задачи"//Перечень задач

val PlanOfEvacuation: String = "План эвакуации" //План эвакуации

var listOfHardware: Int = 50 //Список доступного оборудования

var listOfFreeHardware: Int = 20 //Список свободного оборудования

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

var planB: String = "План мероприятий 2"//План мероприятий на случай сбоев

var participatesAndGhosts: String = "" //Список экспертов и жюри

val selection: String = "" //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

val privacyPolicy: String = "" //Политика конфиденциальности

val //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.

var temperature: Int = 20 //Текущая температура в помещении

var monitoringOfHardware: String = "" //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.

var lightLevel: Int = 2700 //Уровень освещения

val eventLog: String = "" //Лог событий мероприятия

var medicalHelpAvailable: Boolean = true //Доступность медицинской помощи

private var planForStaff: String = "План для обеспечения безопасности"//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.

val number: Int = 1987907 //Регистрационный номер мероприятия

const val maxNoiseLevel: Int = 80 //Максимально допустимый уровень шума в помещении хакатона.

var isNoiseExceeded: Boolean = false //Индикатор превышения уровня шума в помещениях

var eventFormat: String = "Hackaton" //Формат мероприятия (зависит от геополитической обстановки)

var freeRestSeats: Int = 15 //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.

lateinit var pressPlan: String //План взаимодействия с прессой

val teamProjectDetails: String by lazy {""} //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

var permitsReceived: Boolean = true //Статус получения всех необходимых разрешений

var exclusiveResources: Boolean = false //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

val eventPartners: String = "Partners" //Список партнеров мероприятия

lateinit var photo: String //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

lateinit var prizePlan: String //План распределения призов

val emergencyContacts: String = "Partners" //Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.

val specialConditions: String? = null //Особые условия для участников с ограниченными возможностями

val moodOfParticipates: String by lazy {""} //Общее настроение участников (определяется опросами)

var plan: String = "Plan of Hackaton"//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.

lateinit var guest: String //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.

var specialGuestName: String = "" //Максимальное количество людей, которое может вместить место проведения.

const val maxGuests: Int = 300 //Стандартное количество часов, отведенное каждой команде для работы над проектом.

var currentTemperature: Double = 22.5 //Текущая температура в помещении

