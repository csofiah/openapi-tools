---
title: Geographic API v1.0
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="geographic-api">Geographic API v1.0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

API for geographical units management.

Base URLs:

* <a href="http://localhost:9090">http://localhost:9090</a>

<h1 id="geographic-api-communities">communities</h1>

## findCommunities

<a id="opIdfindCommunities"></a>

`GET /communities`

<h3 id="findcommunities-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|name|query|string|false|none|

> Example responses

> OK

```json
[
  {
    "communityId": "CFN",
    "name": "C.F. Navarra"
  },
  {
    "communityId": "RDM",
    "name": "R. Murcia"
  }
]
```

<h3 id="findcommunities-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="findcommunities-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Community](#schemacommunity)]|false|none|none|
|» communityId|string|true|none|none|
|» name|string|true|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## findCommunityById

<a id="opIdfindCommunityById"></a>

`GET /communities/{communityId}`

<h3 id="findcommunitybyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|communityId|path|string|true|none|

> Example responses

> 200 Response

```json
{
  "longName": "Comunidad Autónoma de Madrid",
  "provinceIds": [
    "28",
    "05",
    "40"
  ],
  "provinces": [
    {
      "provinceId": "28",
      "name": "Madrid"
    }
  ],
  "communityId": "CAM",
  "name": "C. Madrid"
}
```

<h3 id="findcommunitybyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[ExtendedCommunity](#schemaextendedcommunity)|

<aside class="success">
This operation does not require authentication
</aside>

## createOrReplaceCommunity

<a id="opIdcreateOrReplaceCommunity"></a>

`PUT /communities/{communityId}`

> Body parameter

```json
{
  "communityId": "CYL",
  "name": "Cast. León",
  "longName": "Castilla y León"
}
```

<h3 id="createorreplacecommunity-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|communityId|path|string|true|none|
|body|body|[ExtendedCommunity](#schemaextendedcommunity)|true|none|

> Example responses

> Replaced

```json
{
  "communityId": "CYL",
  "name": "Cast. León",
  "longName": "Castilla y León"
}
```

> Created

```json
{
  "communityId": "CYL",
  "name": "Cast. León",
  "longName": "Castilla y León"
}
```

<h3 id="createorreplacecommunity-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Replaced|[ExtendedCommunity](#schemaextendedcommunity)|
|201|[Created](https://tools.ietf.org/html/rfc7231#section-6.3.2)|Created|[ExtendedCommunity](#schemaextendedcommunity)|

<aside class="success">
This operation does not require authentication
</aside>

## deleteCommunity

<a id="opIddeleteCommunity"></a>

`DELETE /communities/{communityId}`

<h3 id="deletecommunity-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|communityId|path|string|true|none|

<h3 id="deletecommunity-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|204|[No Content](https://tools.ietf.org/html/rfc7231#section-6.3.5)|OK|None|

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="geographic-api-provinces">provinces</h1>

## findProvinces

<a id="opIdfindProvinces"></a>

`GET /provinces`

<h3 id="findprovinces-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|name|query|string|false|none|

> Example responses

> OK

```json
[
  {
    "provinceId": "42",
    "name": "Soria"
  },
  {
    "provinceId": "49",
    "name": "Zamora"
  }
]
```

<h3 id="findprovinces-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="findprovinces-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Province](#schemaprovince)]|false|none|none|
|» provinceId|string|true|none|none|
|» name|string|true|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## findProvinceById

<a id="opIdfindProvinceById"></a>

`GET /provinces/{provinceId}`

<h3 id="findprovincebyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|provinceId|path|string|true|none|

> Example responses

> 200 Response

```json
{
  "longName": "Madrid",
  "communityId": "CAM",
  "provinceId": "28",
  "name": "Madrid"
}
```

<h3 id="findprovincebyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[ExtendedProvince](#schemaextendedprovince)|

<aside class="success">
This operation does not require authentication
</aside>

## createOrReplaceProvince

<a id="opIdcreateOrReplaceProvince"></a>

`PUT /provinces/{provinceId}`

> Body parameter

```json
{
  "provinceId": "24",
  "name": "León",
  "longName": "León",
  "communityId": "CYL"
}
```

<h3 id="createorreplaceprovince-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|provinceId|path|string|true|none|
|body|body|[ExtendedProvince](#schemaextendedprovince)|true|none|

> Example responses

> Replaced

```json
{
  "provinceId": "24",
  "name": "León",
  "longName": "León",
  "communityId": "CYL"
}
```

> Created

```json
{
  "provinceId": "24",
  "name": "León",
  "longName": "León",
  "communityId": "CYL"
}
```

<h3 id="createorreplaceprovince-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Replaced|[ExtendedProvince](#schemaextendedprovince)|
|201|[Created](https://tools.ietf.org/html/rfc7231#section-6.3.2)|Created|[ExtendedProvince](#schemaextendedprovince)|

<aside class="success">
This operation does not require authentication
</aside>

## deleteProvince

<a id="opIddeleteProvince"></a>

`DELETE /provinces/{provinceId}`

<h3 id="deleteprovince-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|provinceId|path|string|true|none|

<h3 id="deleteprovince-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|204|[No Content](https://tools.ietf.org/html/rfc7231#section-6.3.5)|OK|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_Community">Community</h2>
<!-- backwards compatibility -->
<a id="schemacommunity"></a>
<a id="schema_Community"></a>
<a id="tocScommunity"></a>
<a id="tocscommunity"></a>

```json
{
  "communityId": "CAM",
  "name": "C. Madrid"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|communityId|string|true|none|none|
|name|string|true|none|none|

<h2 id="tocS_ExtendedCommunity">ExtendedCommunity</h2>
<!-- backwards compatibility -->
<a id="schemaextendedcommunity"></a>
<a id="schema_ExtendedCommunity"></a>
<a id="tocSextendedcommunity"></a>
<a id="tocsextendedcommunity"></a>

```json
{
  "longName": "Comunidad Autónoma de Madrid",
  "provinceIds": [
    "28",
    "05",
    "40"
  ],
  "provinces": [
    {
      "provinceId": "28",
      "name": "Madrid"
    }
  ],
  "communityId": "CAM",
  "name": "C. Madrid"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|longName|string|false|none|none|
|provinceIds|[string]|false|none|none|
|provinces|[[Province](#schemaprovince)]|false|none|none|

allOf

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[Community](#schemacommunity)|false|none|none|

and

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|object|false|none|none|

<h2 id="tocS_Province">Province</h2>
<!-- backwards compatibility -->
<a id="schemaprovince"></a>
<a id="schema_Province"></a>
<a id="tocSprovince"></a>
<a id="tocsprovince"></a>

```json
{
  "provinceId": "28",
  "name": "Madrid"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|provinceId|string|true|none|none|
|name|string|true|none|none|

<h2 id="tocS_ExtendedProvince">ExtendedProvince</h2>
<!-- backwards compatibility -->
<a id="schemaextendedprovince"></a>
<a id="schema_ExtendedProvince"></a>
<a id="tocSextendedprovince"></a>
<a id="tocsextendedprovince"></a>

```json
{
  "longName": "Madrid",
  "communityId": "CAM",
  "provinceId": "28",
  "name": "Madrid"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|longName|string|false|none|none|
|communityId|string|true|none|none|

allOf

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[Province](#schemaprovince)|false|none|none|

and

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|object|false|none|none|

