package kotlincourse.synthetiс.kotlincourse.lesson3

val eventName: String = "Hackathon Survival" //Название мероприятия

var eventDate: String = "13.09.2024" //Дата проведения

val eventPlace: String = "DK Uriupinsk" //Место проведения

private var budget: String = {
    val rentalOfRoom: Double = 299.99
    val rentalOfHardware: Double = 199.99
    var cathering: Double = 99.99
    var security: Double = 69.99
    var prizes: String = "iPad, iPhone, Money"
    var other:
} //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.

var quantityOfParticipates: Int = 0
    get() = field
    private set(value) {field=value} //Количество участников

var duration: Long = "360*60" //Длительность хакатона

private val contacts: String = "+79009990099 Inga"//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.

var status: String = "Не начат" //Текущее состояние хакатона (статус)

var sponsors: String = "Спонсоры" //Список спонсоров

private var wholeBudget: // Бюджет мероприятия

var levelOfInternet: String = "1"//Текущий уровень доступа к интернету

private var deliveryOfStuff: String = "Информация о транспортировке"//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

var quantityOfTeams: Int = 0 //Количество команд

val tasks: String = "Задачи"//Перечень задач

val PlanOfEvacuation: String = "План эвакуации" //План эвакуации

var listOfHardware: String = 50 //Список доступного оборудования

var listOfHardware: String = 50 //Список свободного оборудования

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

var planB: String = "План мероприятий 2"//План мероприятий на случай сбоев

var participatesAndGhosts: String = "" //Список экспертов и жюри

val selection: String = "" //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

val privacyPolicy: String = "" //Политика конфиденциальности

val //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.

var temperature: Int = 20 //Текущая температура в помещении

var monitoringOfHardware: String = "" //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
    if (value == "Стабильно") field = ""

var lightLevel: Int = 2700 //Уровень освещения

val eventLog: String = "" //Лог событий мероприятия

var medicalHelpAvailable: Boolean = true //Доступность медицинской помощи

private var planForStaff: String = "План для обеспечения безопасности"//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.

val number: Int = 1987907 //Регистрационный номер мероприятия

const val maxNoiseLevel: Int = 80 //Максимально допустимый уровень шума в помещении хакатона.

var isNoiseExceeded: Boolean = false //Индикатор превышения уровня шума в помещениях

var eventFormat: String = "Hackaton" //Формат мероприятия (зависит от геополитической обстановки)

var freeRestSeats: Int = 15 //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.

lateinit var pressPlan: String = ""  //План взаимодействия с прессой

val teamProjectDetails: String by Lazy {} //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

var permitsReceived: Boolean = true //Статус получения всех необходимых разрешений

var exclusiveResources: Boolean = false //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

val eventPartners: String = "Partners" //Список партнеров мероприятия

lateinit var photo: String = "Link to photo" //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

lateinit var prizePlan: String = ""//План распределения призов

val emergencyContacts: String = "Partners" //Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.

val specialConditions: String? = null //Особые условия для участников с ограниченными возможностями

val moodOfParticipates: String by lazy {""} //Общее настроение участников (определяется опросами)

lateinit var photo: String = "Link to photo" //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.

lateinit var plan: String = "" //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.

var specialGuestName: String = "" //Максимальное количество людей, которое может вместить место проведения.

const val maxGuests: Int = 300 //Стандартное количество часов, отведенное каждой команде для работы над проектом.

var currentTemperature: Double = 22.5 //Текущая температура в помещении

