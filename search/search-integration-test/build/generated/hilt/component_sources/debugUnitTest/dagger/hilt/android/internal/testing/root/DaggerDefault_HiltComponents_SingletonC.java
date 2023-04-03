package dagger.hilt.android.internal.testing.root;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.karthyks.dice.network.config.NetworkConfig;
import com.karthyks.dice.network.di.ApiCallerDIModule;
import com.karthyks.dice.network.di.ApiCallerDIModule_ProvideSafeApiCallerFactory;
import com.karthyks.dice.network.di.MusicBrainzServiceDIModule;
import com.karthyks.dice.network.di.MusicBrainzServiceDIModule_ProvideMusicBrainzEndpointFactory;
import com.karthyks.dice.network.di.MusicBrainzServiceDIModule_ProvideMusicBrainzServiceFactory;
import com.karthyks.dice.network.di.NetworkDIModule;
import com.karthyks.dice.network.di.NetworkDIModule_ProvideApiContextInterceptorFactory;
import com.karthyks.dice.network.di.NetworkDIModule_ProvideMoshiFactory;
import com.karthyks.dice.network.di.NetworkDIModule_ProvideOkHttpClientFactory;
import com.karthyks.dice.network.di.NetworkDIModule_ProvideRetrofitFactory;
import com.karthyks.dice.network.endpoint.MusicBrainzEndpoint;
import com.karthyks.dice.network.helper.SafeApiCaller;
import com.karthyks.dice.search.SearchViewModel;
import com.karthyks.dice.search.SearchViewModelDelegateImpl;
import com.karthyks.dice.search.SearchViewModel_HiltModules_KeyModule_ProvideFactory;
import com.karthyks.dice.search.di.ArtistMapperModule;
import com.karthyks.dice.search.di.ArtistMapperModule_ProvideArtistMapperFactory;
import com.karthyks.dice.search.di.ArtistStringProviderDIModule;
import com.karthyks.dice.search.di.ArtistStringProviderDIModule_ProvideArtistStringProviderFactory;
import com.karthyks.dice.search.di.SearchBaseModule;
import com.karthyks.dice.search.mapper.ArtistMapper;
import com.karthyks.dice.search.mapper.SearchMapper;
import com.karthyks.dice.search.mapper.SearchMapperModule;
import com.karthyks.dice.search.mapper.SearchMapperModule_ProvideSearchMapperFactory;
import com.karthyks.dice.search.pager.DataSourceFactory;
import com.karthyks.dice.search.pager.di.DataSourceDIModule;
import com.karthyks.dice.search.pager.di.DataSourceDIModule_ProvideDataSourceFactoryFactory;
import com.karthyks.dice.search.repository.SearchRepository;
import com.karthyks.dice.search.repository.SearchRepositoryModule;
import com.karthyks.dice.search.repository.SearchRepositoryModule_ProvideSearchRepositoryFactory;
import com.karthyks.dice.search.resource.ArtistStringProvider;
import com.karthyks.dice.search.test.SearchIntegrationTest;
import com.karthyks.dice.search.test.SearchIntegrationTest_MembersInjector;
import com.karthyks.dice.search.test.di.SearchTestDIModule;
import com.karthyks.dice.service.musicbrainz.MusicBrainzService;
import com.karthyks.dice.testframework.BaseTest_MembersInjector;
import com.karthyks.dice.testframework.ServerPort;
import com.karthyks.dice.testframework.di.HiltWrapper_TestCoroutinesModule;
import com.karthyks.dice.testframework.di.TestCoroutinesModule;
import com.karthyks.dice.testframework.di.TestCoroutinesModule_ProvideIOCoroutineDispatcherFactory;
import com.karthyks.dice.testframework.di.TestCoroutinesModule_ProvideMainCoroutineDispatcherFactory;
import com.karthyks.dice.testframework.di.TestCoroutinesModule_ProvideTestDispatcherFactory;
import com.karthyks.dice.testframework.di.TestCoroutinesModule_ProvideTestSchedulerFactory;
import com.karthyks.dice.testframework.di.TestModule;
import com.karthyks.dice.testframework.di.TestModule_ProvideNetworkConfigFactory;
import com.karthyks.dice.testframework.di.TestModule_ProvideServerPortFactory;
import com.squareup.moshi.Moshi;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.test.TestCoroutineScheduler;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerDefault_HiltComponents_SingletonC {
  private DaggerDefault_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder apiCallerDIModule(ApiCallerDIModule apiCallerDIModule) {
      Preconditions.checkNotNull(apiCallerDIModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_TestCoroutinesModule(
        HiltWrapper_TestCoroutinesModule hiltWrapper_TestCoroutinesModule) {
      Preconditions.checkNotNull(hiltWrapper_TestCoroutinesModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder testCoroutinesModule(TestCoroutinesModule testCoroutinesModule) {
      Preconditions.checkNotNull(testCoroutinesModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder musicBrainzServiceDIModule(
        MusicBrainzServiceDIModule musicBrainzServiceDIModule) {
      Preconditions.checkNotNull(musicBrainzServiceDIModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkDIModule(NetworkDIModule networkDIModule) {
      Preconditions.checkNotNull(networkDIModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder searchTestDIModule(SearchTestDIModule searchTestDIModule) {
      Preconditions.checkNotNull(searchTestDIModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder searchBaseModule(SearchBaseModule searchBaseModule) {
      Preconditions.checkNotNull(searchBaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataSourceDIModule(DataSourceDIModule dataSourceDIModule) {
      Preconditions.checkNotNull(dataSourceDIModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder searchRepositoryModule(SearchRepositoryModule searchRepositoryModule) {
      Preconditions.checkNotNull(searchRepositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder searchMapperModule(SearchMapperModule searchMapperModule) {
      Preconditions.checkNotNull(searchMapperModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder artistMapperModule(ArtistMapperModule artistMapperModule) {
      Preconditions.checkNotNull(artistMapperModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder artistStringProviderDIModule(
        ArtistStringProviderDIModule artistStringProviderDIModule) {
      Preconditions.checkNotNull(artistStringProviderDIModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder testModule(TestModule testModule) {
      Preconditions.checkNotNull(testModule);
      return this;
    }

    public Default_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements Default_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public Default_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements Default_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public Default_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements Default_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public Default_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements Default_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Default_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements Default_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Default_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements Default_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public Default_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements Default_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public Default_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends Default_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends Default_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends Default_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends Default_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(SearchViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends Default_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<SearchViewModel> searchViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.searchViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>of("com.karthyks.dice.search.SearchViewModel", ((Provider) searchViewModelProvider));
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.karthyks.dice.search.SearchViewModel 
          return (T) new SearchViewModel(singletonCImpl.searchViewModelDelegateImpl());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends Default_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends Default_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends Default_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<TestCoroutineScheduler> provideTestSchedulerProvider;

    private Provider<CoroutineDispatcher> provideTestDispatcherProvider;

    private Provider<ServerPort> provideServerPortProvider;

    private Provider<CoroutineDispatcher> provideMainCoroutineDispatcherProvider;

    private Provider<CoroutineDispatcher> provideIOCoroutineDispatcherProvider;

    private Provider<OkHttpClient> provideOkHttpClientProvider;

    private Provider<NetworkConfig> provideNetworkConfigProvider;

    private Provider<Moshi> provideMoshiProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<MusicBrainzEndpoint> provideMusicBrainzEndpointProvider;

    private Provider<SafeApiCaller> provideSafeApiCallerProvider;

    private Provider<MusicBrainzService> provideMusicBrainzServiceProvider;

    private Provider<SearchMapper> provideSearchMapperProvider;

    private Provider<SearchRepository> provideSearchRepositoryProvider;

    private Provider<DataSourceFactory> provideDataSourceFactoryProvider;

    private Provider<ArtistStringProvider> provideArtistStringProvider;

    private Provider<ArtistMapper> provideArtistMapperProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private Interceptor provideApiContextInterceptor() {
      return NetworkDIModule_ProvideApiContextInterceptorFactory.provideApiContextInterceptor(provideNetworkConfigProvider.get());
    }

    private Set<Interceptor> setOfInterceptor() {
      return ImmutableSet.<Interceptor>of(provideApiContextInterceptor());
    }

    private SearchViewModelDelegateImpl searchViewModelDelegateImpl() {
      return new SearchViewModelDelegateImpl(provideMainCoroutineDispatcherProvider.get(), provideDataSourceFactoryProvider.get(), provideArtistMapperProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideTestSchedulerProvider = DoubleCheck.provider(new SwitchingProvider<TestCoroutineScheduler>(singletonCImpl, 1));
      this.provideTestDispatcherProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineDispatcher>(singletonCImpl, 0));
      this.provideServerPortProvider = DoubleCheck.provider(new SwitchingProvider<ServerPort>(singletonCImpl, 2));
      this.provideMainCoroutineDispatcherProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineDispatcher>(singletonCImpl, 3));
      this.provideIOCoroutineDispatcherProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineDispatcher>(singletonCImpl, 6));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 10));
      this.provideNetworkConfigProvider = DoubleCheck.provider(new SwitchingProvider<NetworkConfig>(singletonCImpl, 11));
      this.provideMoshiProvider = DoubleCheck.provider(new SwitchingProvider<Moshi>(singletonCImpl, 12));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 9));
      this.provideMusicBrainzEndpointProvider = DoubleCheck.provider(new SwitchingProvider<MusicBrainzEndpoint>(singletonCImpl, 8));
      this.provideSafeApiCallerProvider = DoubleCheck.provider(new SwitchingProvider<SafeApiCaller>(singletonCImpl, 13));
      this.provideMusicBrainzServiceProvider = DoubleCheck.provider(new SwitchingProvider<MusicBrainzService>(singletonCImpl, 7));
      this.provideSearchMapperProvider = SingleCheck.provider(new SwitchingProvider<SearchMapper>(singletonCImpl, 14));
      this.provideSearchRepositoryProvider = SingleCheck.provider(new SwitchingProvider<SearchRepository>(singletonCImpl, 5));
      this.provideDataSourceFactoryProvider = SingleCheck.provider(new SwitchingProvider<DataSourceFactory>(singletonCImpl, 4));
      this.provideArtistStringProvider = SingleCheck.provider(new SwitchingProvider<ArtistStringProvider>(singletonCImpl, 16));
      this.provideArtistMapperProvider = SingleCheck.provider(new SwitchingProvider<ArtistMapper>(singletonCImpl, 15));
    }

    @Override
    public void injectTest(SearchIntegrationTest arg0) {
      injectSearchIntegrationTest(arg0);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @CanIgnoreReturnValue
    private SearchIntegrationTest injectSearchIntegrationTest(SearchIntegrationTest instance) {
      BaseTest_MembersInjector.injectCoroutineDispatcher(instance, provideTestDispatcherProvider.get());
      BaseTest_MembersInjector.injectServerPort(instance, provideServerPortProvider.get());
      SearchIntegrationTest_MembersInjector.injectSearchViewModelDelegate(instance, searchViewModelDelegateImpl());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // @com.karthyks.dice.coroutines.annotation.Test kotlinx.coroutines.CoroutineDispatcher 
          return (T) TestCoroutinesModule_ProvideTestDispatcherFactory.provideTestDispatcher(singletonCImpl.provideTestSchedulerProvider.get());

          case 1: // kotlinx.coroutines.test.TestCoroutineScheduler 
          return (T) TestCoroutinesModule_ProvideTestSchedulerFactory.provideTestScheduler();

          case 2: // com.karthyks.dice.testframework.ServerPort 
          return (T) TestModule_ProvideServerPortFactory.provideServerPort();

          case 3: // @com.karthyks.dice.coroutines.annotation.Main kotlinx.coroutines.CoroutineDispatcher 
          return (T) TestCoroutinesModule_ProvideMainCoroutineDispatcherFactory.provideMainCoroutineDispatcher(singletonCImpl.provideTestDispatcherProvider.get());

          case 4: // com.karthyks.dice.search.pager.DataSourceFactory 
          return (T) DataSourceDIModule_ProvideDataSourceFactoryFactory.provideDataSourceFactory(singletonCImpl.provideSearchRepositoryProvider.get());

          case 5: // com.karthyks.dice.search.repository.SearchRepository 
          return (T) SearchRepositoryModule_ProvideSearchRepositoryFactory.provideSearchRepository(singletonCImpl.provideIOCoroutineDispatcherProvider.get(), singletonCImpl.provideMusicBrainzServiceProvider.get(), singletonCImpl.provideSearchMapperProvider.get());

          case 6: // @com.karthyks.dice.coroutines.annotation.IO kotlinx.coroutines.CoroutineDispatcher 
          return (T) TestCoroutinesModule_ProvideIOCoroutineDispatcherFactory.provideIOCoroutineDispatcher(singletonCImpl.provideTestDispatcherProvider.get());

          case 7: // com.karthyks.dice.service.musicbrainz.MusicBrainzService 
          return (T) MusicBrainzServiceDIModule_ProvideMusicBrainzServiceFactory.provideMusicBrainzService(singletonCImpl.provideMusicBrainzEndpointProvider.get(), singletonCImpl.provideSafeApiCallerProvider.get());

          case 8: // com.karthyks.dice.network.endpoint.MusicBrainzEndpoint 
          return (T) MusicBrainzServiceDIModule_ProvideMusicBrainzEndpointFactory.provideMusicBrainzEndpoint(singletonCImpl.provideRetrofitProvider.get());

          case 9: // retrofit2.Retrofit 
          return (T) NetworkDIModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideOkHttpClientProvider.get(), singletonCImpl.provideNetworkConfigProvider.get(), singletonCImpl.setOfInterceptor(), singletonCImpl.provideMoshiProvider.get());

          case 10: // okhttp3.OkHttpClient 
          return (T) NetworkDIModule_ProvideOkHttpClientFactory.provideOkHttpClient();

          case 11: // com.karthyks.dice.network.config.NetworkConfig 
          return (T) TestModule_ProvideNetworkConfigFactory.provideNetworkConfig(singletonCImpl.provideServerPortProvider.get());

          case 12: // com.squareup.moshi.Moshi 
          return (T) NetworkDIModule_ProvideMoshiFactory.provideMoshi();

          case 13: // com.karthyks.dice.network.helper.SafeApiCaller 
          return (T) ApiCallerDIModule_ProvideSafeApiCallerFactory.provideSafeApiCaller(singletonCImpl.provideMoshiProvider.get());

          case 14: // com.karthyks.dice.search.mapper.SearchMapper 
          return (T) SearchMapperModule_ProvideSearchMapperFactory.provideSearchMapper();

          case 15: // com.karthyks.dice.search.mapper.ArtistMapper 
          return (T) ArtistMapperModule_ProvideArtistMapperFactory.provideArtistMapper(singletonCImpl.provideArtistStringProvider.get());

          case 16: // com.karthyks.dice.search.resource.ArtistStringProvider 
          return (T) ArtistStringProviderDIModule_ProvideArtistStringProviderFactory.provideArtistStringProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
