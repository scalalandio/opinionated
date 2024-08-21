package opinionated.typelevel

// Like export cats.{*, given}, cats.kernel.{*.given} but we cannot do this for packages
export cats.{
  :<:,
  :≺:,
  ~>,
  ⊤,
  ⊥,
  catsAlignForId,
  catsInstancesForId,
  catsParallelForId,
  catsRepresentableForId,
  ApplicativeThrow,
  Endo,
  Id,
  MonadThrow
}
export cats.kernel.{
  Band,
  BoundedEnumerable,
  BoundedSemilattice,
  CommutativeGroup,
  CommutativeMonoid,
  CommutativeSemigroup,
  Comparison,
  Eq,
  Group,
  Hash,
  LowerBounded,
  Monoid,
  PartialOrder,
  Semigroup,
  Semilattice,
  UpperBounded
}
export cats.data.{
  Chain,
  Cokleisli,
  Const,
  Cont,
  ContT,
  IndexedReaderWriterStateT,
  IndexedState,
  IndexedStateT,
  Ior,
  IorNec,
  IorNel,
  IorNes,
  IorT,
  Kleisli,
  NonEmptyChain,
  NonEmptyLazyList,
  NonEmptyList,
  NonEmptyMap,
  NonEmptySet,
  Reader,
  ReaderT,
  State,
  StateT,
  Writer,
  WriterT
}
// Like export cats.effect.{*, given} but we cannot do this for packages
export cats.effect.{
  Async,
  Clock,
  Concurrent,
//Cont, // same name as cats.data.Cont
  Deferred,
  ExitCode,
  Fiber,
  FiberIO,
  GenConcurrent,
  GenSpawn,
  GenTemporal,
  IO,
  IOApp,
  IOLocal,
  LiftIO,
  MonadCancel,
  MonadCancelThrow,
  Outcome,
  OutcomeIO,
  ParallelF,
  Poll,
  Ref,
  Resource,
  ResourceApp,
  ResourceIO,
  Spawn,
  Sync,
  SyncIO,
  Temporal,
  Trace,
  Unique
}
export cats.effect.tracing.TracingConstants
// TODO: add the rest of stuff from fs2
export fs2.{Chunk, Collector, CollectorK, CompositeFailure, Pipe, Pipe2, Pure}

object implicits {
  export cats.implicits.{*, given}
  export cats.effect.implicits.{*, given}
}

object unsafe {
  // TODO: cannot just export all from package cats.effect.unsafe
}
