# Planning Center Api
This is an unofficial Planning Center API wrapper for Java clients. Currently, only a subset of the Services product has been implemented.

## Getting Started
This API can be used in two ways, as a person application or as an OAuth client. Here's how you can configure the API if you are using it to access your own resources:
```
PlanningCenterClient pco = new PlanningCenterClient(APPLICATION_ID, APPLICATION_SECRET);
```

Or, if you are accessing resources that don't belong to you, use the OAuth version:
```
PlanningCenterClient pco = new PlanningCenterClient(OAUTH_ACCESS_TOKEN);
```

## Usage
This API was designed to be as clear and easy to use as possible. If you are attempting to access a collection of resources (something like Songs), you can access it like this:
```
ServicesApi servicesApi = pco.getServicesApi();
Songs songs = servicesApi.songs().list();
```

If you'd like to access a particular resource (like a specific Song), you can access it like this:
```
ServicesApi servicesApi = pco.getServicesApi();
Song song = servicesApi.song(12345).get();
```

Some endpoints support full CRUD opertations. The API was designed to resemble what the URL would look like. For example, if you'd like to create a new resource, use the collection endpoint:

```
CreateSongRequest createRequest = new CreateSongRequest.Builder()
  .title("Amazing Grace")
  .build();
  
Song song = servicesApi.songs().create(createRequest);
```

If you want to update or delete a specific resource, you would do it like this:
```
UpdateSongRequest updateRequest = new UpdateSongRequest.Builder()
  .title("This is Amazing Grace")
  .build();
  
Song song = servicesApi.song(12345).update(updateRequest);

servicesApi.song(12345).delete();
```

### Accessing Associations
If you're looking to access an associated resource (like Arrangements on a Song), you can do that like this:
```
Arrangements arrangements = servicesApi.song(12345).arrangements().list();
```

OR

```
Arrangement arrangement = servicesApi.song(12345).arrangement(98765).get();
```

### Request Params
Some collection endpoints allow you to order the results, include additional resources or query by a given value. You can do that like this:

```
SongRequestOptions params = new SongRequestOptions.Builder()
  .queryBy(SongQueryableParam.TITLE, "Grace")
  .offset(10)
  .perPage(70)
  .build();
  
Songs songs = servicesApi.songs().list(params);
```

All the allowed params are exposed through enums, taking out the guess work of what params you can add to the request.

