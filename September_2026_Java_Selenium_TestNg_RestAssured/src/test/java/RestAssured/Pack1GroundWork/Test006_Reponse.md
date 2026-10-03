# JSONPath Query – `find{}`

### Query

```java
"find{it.id==8646418}.name"
```

This is a **JsonPath query** used with Rest Assured to **find an object in a JSON array based on a condition and then extract a field from that object**.

### Breakdown

```text
find{it.id==8646418}.name
│    │  │  │        │
│    │  │  │        └── Field to extract
│    │  │  └─────────── Value to compare
│    │  └────────────── Field being checked
│    └───────────────── Current object
└────────────────────── Search for matching object
```

### Meaning of Each Part

**`find`**

Searches through the objects in a JSON array.

**`it`**

Represents the **current object** being evaluated.

**`it.id`**

Accesses the `id` field of the current object.

**`== 8646418`**

Checks whether the current object's `id` is equal to `8646418`.

**`.name`**

After finding the matching object, retrieves its `name` field.

### Example

If the response contains:

```json
[
    {
        "id": 123,
        "name": "John"
    },
    {
        "id": 8646418,
        "name": "Bhuvanesh Khatri"
    },
    {
        "id": 456,
        "name": "David"
    }
]
```

The query:

```java
"find{it.id==8646418}.name"
```

works like this:

```text
Find object
    ↓
where id == 8646418
    ↓
Found:
{
    "id": 8646418,
    "name": "Bhuvanesh Khatri"
}
    ↓
Get name
    ↓
"Bhuvanesh Khatri"
```

Used in Rest Assured:

```java
String name = jp.getString("find{it.id==8646418}.name");
```

### Important Pattern

```text
find{condition}.field
```

**Meaning:**

> Find the JSON object that satisfies the condition, then retrieve the required field.

For example:

```java
"find{it.id==8646418}.name"
```

means:

> **Find the object where `id` is `8646418`, then get its `name`.**